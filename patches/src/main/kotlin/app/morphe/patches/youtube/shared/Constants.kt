package app.morphe.patches.youtube.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

internal object Constants {
    val COMPATIBILITY_YOUTUBE = Compatibility(
        name = "YouTube",
        packageName = "com.google.android.youtube",
        apkFileType = ApkFileType.APK_REQUIRED,
        appIconColor = 0xFF0033,
        signatures = setOf(
            // Android 13+
            "5aad2bee6db95d17e05a08d7d1e64c10a1511879154483916b6ae6c7fd9cb0c6",
            // Android 7+
            "3d7a1223019aa39d9ea0e3436ab7c0896bfb4fb679f4de5fe7c23f326c8f994a"
        ),
        targets = listOf(
            AppTarget(
                version = "21.47.483",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.46.524",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.45.90",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.44.528",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.43.523",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.42.241",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.41.525",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.39.522",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.38.130",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.38.123",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.37.42",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.36.45",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.35.442",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.34.243",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.33.321",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.32.2",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.31.523",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.30.216",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.30.209",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.29.366",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.28.208", // The first version that fully implements the removal of support for different miniplayers.
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.28.204", // The first version that debuts the removal of support for different miniplayers.
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.26.360",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.25.523",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.24.360",
                minSdk = 29,
                isExperimental = true
            ),
            AppTarget(
                version = "21.23.492", // Last version for Android 9.0
                minSdk = 28
            ),
            AppTarget(
                version = "21.23.480",
                minSdk = 28,
                isExperimental = true
            ),
            AppTarget(
                version = "21.20.405",
                minSdk = 28
            ),
            AppTarget(
                version = "21.16.256",
                minSdk = 28
            ),
            AppTarget(
                version = "21.13.164", 
                minSdk = 28
            ),
            AppTarget(
                version = "21.07.247",
                minSdk = 28
            ),
            AppTarget(
                version = "21.05.265",
                minSdk = 28,
                isExperimental = true
            ),
            AppTarget(
                version = "21.04.223",
                minSdk = 28
            ),
            AppTarget(
                version = "20.51.39",
                minSdk = 28
            ),
            AppTarget(
                version = "20.26.46", // Last version for Android 8.0
                minSdk = 26
            )
        )
    )
}
