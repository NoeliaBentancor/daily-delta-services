plugins {
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    java
}

dependencies {
    implementation(project(":application"))
    implementation(project(":infrastructure"))

    implementation(libs.spring.boot.web)
    implementation(libs.spring.boot.validation)
    implementation(libs.spring.boot.data.jpa)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    runtimeOnly(libs.h2)
}
