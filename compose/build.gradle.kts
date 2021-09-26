plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(31)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(31)
        versionCode(1)
        versionName(Versions.composeVersion)
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }
}

dependencies {
    implementation(Libraries.espresso_core)
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.Compose.junit)
}

