object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeBom by lazy { "androidx.compose:compose-bom:2023.08.00" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial by lazy { "androidx.compose.material3:material3" }
    val jUnit by lazy { "junit:junit:4.13.2" }
    val testjUnit by lazy { "androidx.test.ext:junit:1.2.1" }
    val testExpresso by lazy { "androidx.test.espresso:espresso-core:3.6.1"}
    val testManifest by lazy{"androidx.compose.ui:ui-test-manifest"}
    val debugTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val testJUnit by lazy { "androidx.compose.ui:ui-test-junit4" }
    val testBom by lazy { "androidx.compose:compose-bom:2023.08.00" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }


}