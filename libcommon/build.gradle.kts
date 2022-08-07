plugins {
    id("clamber.android.library")
    id("clamber.android.library.jacoco")
    kotlin("kapt")
    id("clamber.spotless")
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.hilt.android)
//    kapt(libs.hilt.compiler)

//    testImplementation(project(":core-testing"))
}