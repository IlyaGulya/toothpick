plugins {
  kotlin("jvm")
  kotlin("kapt")
  id("org.jetbrains.dokka")
  id("gradle-mvn-push")
}



dependencies {
  api(project(":toothpick-runtime"))
  implementation(deps.kotlin_runtime)

  testImplementation(project(":toothpick-testing-junit5"))
  testImplementation(deps.junit5_api)
  testRuntimeOnly(deps.junit5_engine)

  testImplementation(deps.mockito_kotlin)
  testImplementation(deps.mockito_junit5)
  testImplementation(deps.kluent)
  kaptTest(project(":toothpick-compiler"))
}

test {
  useJUnitPlatform()
}