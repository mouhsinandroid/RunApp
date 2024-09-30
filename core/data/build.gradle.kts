plugins {
    alias(libs.plugins.runapp.android.library)
}

android {
    namespace = "com.mouhsinbourqaiba.core.data"
}

dependencies {
    implementation(libs.timber)
}