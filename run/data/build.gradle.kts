plugins {
    alias(libs.plugins.runapp.android.library)
}

android {
    namespace = "com.mouhsinbourqaiba.run.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)
}