plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
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
