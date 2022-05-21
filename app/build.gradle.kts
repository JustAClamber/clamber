import clamber.setupAppModule

plugins {
    id("com.android.application")
    id("kotlin-android")
}

setupAppModule {
    defaultConfig {
        applicationId = "com.clamber"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-rules.pro", "proguard-rules.pro")
            signingConfig = signingConfigs["debug"]
        }
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.kotlinX.coroutines)
    implementation(libs.androidX.appCompat)
    implementation(libs.androidX.core)
    implementation(libs.androidX.activity)
    implementation(libs.androidX.fragment)
    implementation(libs.androidX.constraintLayout)
    implementation(libs.androidX.browser)
    implementation(libs.androidX.viewPager2)
    implementation(libs.androidX.recyclerView)
    implementation(libs.google.material)

//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}