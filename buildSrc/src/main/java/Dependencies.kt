object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial by lazy { "androidx.compose.material3:material3" }
    val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
    val testjUnit by lazy { "androidx.test.ext:junit:${Versions.testJunit}" }
    val testExpresso by lazy { "androidx.test.espresso:espresso-core:${Versions.testExpresso}" }
    val testManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val debugTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val testJUnit by lazy { "androidx.compose.ui:ui-test-junit4" }
    val testBom by lazy { "androidx.compose:compose-bom:${Versions.testBom}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }


    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }

    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltnav}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }

    val gsonConvertor by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConvertor}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }


    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }

  val splashScreen by lazy {"androidx.core:core-splashscreen:${Versions.splashScreen}"}

    val coil by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }

}

object Modules {
    const val utilities = ":utilities"
}