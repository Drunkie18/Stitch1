# Open Photosphere Engine

The end goal: Stitcher is going to be an advanced mobile computer vision library and application built using Kotlin, Native C++ (NDK), and OpenCV. Designed as an open-source alternative to proprietary computational photography pipelines, this engine enables mobile hardware to stitch multiple overlapping images into high-resolution panoramas and complete 360-degree photospheres.

This is mostly to explore and the feature "Photoshphere" found in current pixel camera (on playstore for Androids other than pixel phones strangely) and Gcam modules; in an attempt to improve on stitching ability by potentially using ML in future.
Starting with Stitch1 - to stitch two photos left and right; moving onto next iteration Stitch2 - dealing with 4 photos UL,UR,LL,LR; and so on and so forth.

Photosphere is largely differentiated from something like panaroma, based on the way they capture the data from sensors; while panaroma essentially relies on a low framerate video capturing like on the more newer implementations with HDR by Google, 
the now depreciated photosphere feature use follow the dot and click picture procedure which relies on the user following the dots encasing them with their surroundings in a dome and clicking the necessary pictures.
[The end product of photosphere seems to be only viewable on Photos by Google App from my experience.]
[This photosphere feature uses algorithm from back in 2012, and in the current age of AI weirdly google just chose to remove the photosphere from the pixel camera app for pixel phones themselves in 2023,
although strangely the feature still seems to be available in the app itself if it were to be installed on some other android]



The project scales iteratively through modular development targets:

* **Stitch1:** Dual-image stitching engine resolving horizontal left-and-right frame alignments.
* **Stitch2:** Quad-image matrix layout managing quadrant alignments (Upper-Left, Upper-Right, Lower-Left, Lower-Right).
* **Photosphere Engine:** Full spherical dome projection handling multi-axis coordinate arrays.

---

## 📸 Core Concepts: Photosphere vs. Panorama

Understanding how spatial data is gathered from mobile sensors is critical to implementing the correct software pipeline:

* **Traditional Panorama:** Relies on a continuous, low-framerate video stream. Modern variations utilize fast-exposure bracketed frames stitched sequentially as the user pans smoothly across a single horizontal axis.
* **Photo Sphere:** Originally introduced by Google in 2012, this format relies on a structured, multi-axis spatial grid. Users follow an on-screen "dot-and-circle" guidance system to capture discrete high-resolution stills within a spherical dome. While Google deprecated this native mode in its primary Pixel app in 2023, the underlying spatial metadata framework remains a foundational standard for immersive 360-degree viewing on platforms like Google Photos and VR headsets.

---

## 🚀 System Architecture & Roadmap

Heavy mathematical transformations are offloaded to native C++ via the Java Native Interface (JNI). This bypasses the JVM overhead, maximizing thermal stability and memory management during intensive image registration.

* [x] **Phase 1: Native JNI Core** – Establishing the CMake build configuration, OpenCV linking protocols, and two-image fallback stitching algorithms.
* [ ] **Phase 2: Multi-Axis Capture UI** – Engineering a dynamic 4-to-9 image matrix framework integrated with hardware gyroscope data to drive an interactive dot-matching target overlay.
* [ ] **Phase 3: Automated Canvas Optimization** – Implementing native contour-detection algorithms to automatically isolate and crop out irregular black boundaries generated during perspective transformations.
* [ ] **Phase 4: Spherical Projection & Metadata Injection** – Upgrading to multi-image bundle adjustment and injecting standard Adobe XMP metadata namespaces so output files natively render as interactively scrollable panoramas in 360° viewers.

---

## 🧪 Computational Research & Future Enhancements

To move past traditional 2012-era processing pipelines, this project explores several experimental computational enhancements:

### 1. Burst Multi-Sampling Per Target Point

Instead of taking a single frame at each guided dot alignment, the engine will experiment with rapid bracketing. Capturing multiple sequential exposures at a single point allows the pipeline to filter out motion blur, reduce sensor noise, and minimize perspective warping errors caused by micro-hand tremors.

### 2. Hybrid Capture Pipelines

We are going to be actively researching the trade-offs between a rigid "stop-and-click" guided dot interface and a continuous low-framerate video stream. While continuous streams offer smoother transitions, they often suffer from rolling shutter artifacts and motion blur under low-light conditions.

### 3. Solving the Nadir Problem (Ghosting Artifacts)

A major flaw in classic stitching algorithms occurs when capturing the lowest point of the sphere (the nadir/floor). Users frequently stitch their own feet into the environment, creating fragmented, floating anomalies due to extreme parallax issues.

```
[Parallax Disalignment] -> Stitched Output -> [Fragmented/Floating Anomaly]

```

Our proposed research involves developing an automated semantic masking layer. By identifying ground-plane geometries and isolating user-proximate structures, the engine can implement a contextual background infill—similar to a localized "Magic Eraser"—to erase capture artifacts cleanly from the final ground layer.

---

## 🧠 Computational Photography Pipeline

1. **Feature Detection & Matching:** Utilizing ORB (Oriented FAST and Rotated BRIEF) to map robust keypoint pairs across overlapping viewports.
2. **Homography Estimation:** Implementing RANSAC (Random Sample Consensus) to calculate optimal transformation matrices while discarding false structural matches.
3. **Warping & Multi-Band Blending:** Projecting flat planes onto cylindrical or spherical coordinates and executing multi-band seam-blending to erase exposure deltas across boundaries.

---

## 📖 Digital Photography & Computer Vision Glossary

* **Dynamic Range:** The ratio between the maximum and minimum measurable light intensities (the brightest highlights and darkest shadows) captured within a single scene.
* **Exposure Clipping:** A phenomenon where pixel values exceed the maximum capacity of the digital sensor, resulting in pure white areas (`255, 255, 255` RGB) stripped of all underlying structural detail.
* **Tone Mapping:** A computer vision technique used to map one set of colors/dynamic ranges to another, matching a high-dynamic-range scene onto a standard display screen while preserving local contrast.
* **Parallax Error:** The apparent displacement or shift of an object's position when viewed along two different lines of sight. It is the primary cause of alignment failure when a camera is rotated away from its optical center.
* **Homography:** A projective mapping matrix that describes the geometric relationship between two planar views of the same 3D scene from different camera positions.
* **Nadir / Zenith:** In spherical photography, the *Zenith* is the absolute highest point directly above the camera (the sky/ceiling), and the *Nadir* is the absolute lowest point directly below (the ground/floor).

---

## 💻 Local Developer Setup

1. **Clone the project:** `git clone https://github.com/YOUR_USERNAME/Snapdragon-Stitcher.git`
2. Open the root folder inside **Android Studio**.
3. Ensure **Android NDK** and **CMake** are fully updated via the SDK Manager.
4. Execute a Gradle Sync, compile the `.aar` module, or deploy directly to a physical test device. Filter **Logcat** logs using the tag `NativeStitcher` to monitor JNI calculations in real-time.

---
