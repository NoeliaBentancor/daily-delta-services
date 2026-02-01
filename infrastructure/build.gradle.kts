plugins {
    java
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":application"))

    // Lombok
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    // MapStruct
    implementation(libs.mapstruct)
    annotationProcessor(libs.mapstruct.processor)

    // Jakarta
    implementation(libs.jakarta.persistence)
}
