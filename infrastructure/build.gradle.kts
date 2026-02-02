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
    annotationProcessor(libs.lombok.mapstruct.binding)

    // Jakarta
    implementation(libs.jakarta.persistence)
}
