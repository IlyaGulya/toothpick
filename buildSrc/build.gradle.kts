plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(gradleApi())
        classpath(deps.android_plugin)
        classpath(deps.kotlin_plugin)
        classpath(deps.coverallPlugin)
        classpath(deps.spotlessPlugin)
        classpath(deps.dokkaPlugin)
    }
}



dependencies {
    implementation(gradleApi())
    implementation(deps.android_plugin)
    implementation(deps.kotlin_plugin)
    implementation(deps.coverallPlugin)
    implementation(deps.spotlessPlugin)
    implementation(deps.dokkaPlugin)
}

kotlin {
    // Add Deps to compilation, so it will become available in main project
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}
