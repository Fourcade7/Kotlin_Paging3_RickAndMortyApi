# Kotlin_Paging3_RickAndMortyApi

      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'
      //Paging
      def paging_version = "3.1.1"
      implementation "androidx.paging:paging-runtime:$paging_version"
      //Retrofit
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        //    //Dagger Hilt
        //    implementation "com.google.dagger:hilt-android:2.44"
        //    kapt "com.google.dagger:hilt-compiler:2.44"

      def lifecycle_version = "2.6.1"
      // ViewModel //Coroutine Lifecycle Scopes
      implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
      implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
      //Activity KTX for Viewmodel
      implementation "androidx.activity:activity-ktx:1.4.0"
      //Coil
      implementation("io.coil-kt:coil:2.3.0")

      implementation 'com.github.bumptech.glide:glide:4.15.1'
