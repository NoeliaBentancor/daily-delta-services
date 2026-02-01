plugins {
    id("org.springframework.boot")
    java
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":application"))
    implementation(project(":infrastructure"))

    runtimeOnly 'com.h2database:h2'

}
