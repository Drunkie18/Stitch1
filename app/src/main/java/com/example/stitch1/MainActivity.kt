package com.example.stitch1

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    private lateinit var imageResult: ImageView
    private var bitmapLeft: Bitmap? = null
    private var bitmapRight: Bitmap? = null

    // This is the bridge to your C++ engine
    external fun stitchPanoramas(bitmapLeft: Bitmap, bitmapRight: Bitmap, bitmapOutput: Bitmap)

    init {
        System.loadLibrary("stitch1") // Ensure this matches your CMakeLists.txt target
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageResult = findViewById(R.id.imageResult)
        val btnPhoto1: MaterialButton = findViewById(R.id.btnPhoto1)
        val btnPhoto2: MaterialButton = findViewById(R.id.btnPhoto2)
        val btnStitch: MaterialButton = findViewById(R.id.btnStitch)

        // Launchers to open the Android Photo Gallery
        val pickLeftImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            uri?.let {
                bitmapLeft = loadAndRotateBitmap(it)
                imageResult.setImageBitmap(bitmapLeft) // Show preview
            }
        }

        val pickRightImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            uri?.let {
                bitmapRight = loadAndRotateBitmap(it)
                imageResult.setImageBitmap(bitmapRight) // Show preview
            }
        }

        // Button Click Listeners
        btnPhoto1.setOnClickListener { pickLeftImage.launch("image/*") }
        btnPhoto2.setOnClickListener { pickRightImage.launch("image/*") }

        btnStitch.setOnClickListener {
            if (bitmapLeft != null && bitmapRight != null) {
                // Create an empty bitmap to hold the final stitched image
                val resultBitmap = Bitmap.createBitmap(
                    bitmapLeft!!.width * 2,// removed *2 for this test
                    bitmapLeft!!.height,
                    Bitmap.Config.ARGB_8888
                )

                // Call the C++ engine (we will write this C++ code next!)
                stitchPanoramas(bitmapLeft!!, bitmapRight!!, resultBitmap)

                imageResult.setImageBitmap(resultBitmap)
                Toast.makeText(this, "C++ Engine triggered (Placeholder)!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please select both photos first!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // The EXIF Rotation Fix
    private fun loadAndRotateBitmap(uri: Uri): Bitmap? {
        contentResolver.openInputStream(uri)?.use { inputStream ->
            val originalBitmap = BitmapFactory.decodeStream(inputStream)

            // Re-open stream to read the EXIF data (it gets consumed on first read)
            val exifStream: InputStream? = contentResolver.openInputStream(uri)
            val exif = exifStream?.let { ExifInterface(it) }
            val orientation = exif?.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL)

            val matrix = Matrix()
            when (orientation) {
                ExifInterface.ORIENTATION_ROTATE_90 -> matrix.postRotate(90f)
                ExifInterface.ORIENTATION_ROTATE_180 -> matrix.postRotate(180f)
                ExifInterface.ORIENTATION_ROTATE_270 -> matrix.postRotate(270f)
            }

            return Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.width, originalBitmap.height, matrix, true)
        }
        return null
    }
}