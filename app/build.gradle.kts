plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.booklibraryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.booklibraryapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Navigation Component:
    implementation(libs.navigation.fragment)
    implementation(libs.androidx.navigation.ui.ktx)

    //Room Components:
    implementation("androidx.room:room-runtime:2.5.0")
    annotationProcessor(libs.androidx.room.compiler)
    //noinspection KaptUsageInsteadOfKsp
    kapt("androidx.room:room-compiler:2.5.0")
    implementation(libs.room.ktx)
    testImplementation(libs.room.testing)

    //Lifecycle Components:
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.livedata.ktx)

    // Kotlin Components:
    implementation(libs.kotlin.stdlib)
    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)
}