plugins {
  id("com.android.library")
  id("gradle-mvn-push")
}

repositories {
  google()
}


android {
  compileSdkVersion 28

  compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_7
    targetCompatibility JavaVersion.VERSION_1_7
  }

  defaultConfig {
    minSdkVersion 15

    consumerProguardFiles 'proguard-rules.txt'
  }

  lintOptions {
    textReport true
    textOutput 'stdout'
    // We run a full lint analysis as build part in CI, so skip vital checks for assemble tasks.
    checkReleaseBuilds false
  }
}

dependencies {
  api project(':toothpick-runtime')
  compileOnly deps.inject

  testImplementation project(':toothpick-testing')
  testImplementation deps.junit4
  testImplementation deps.mockito
  testImplementation deps.robolectric
  testImplementation deps.androidx_test_core
}