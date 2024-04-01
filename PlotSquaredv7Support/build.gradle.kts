plugins {
    id("java")
}

repositories {
    mavenCentral()
    maven("https://maven.enginehub.org/repo/")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation(platform("com.intellectualsites.bom:bom-newest:1.43"))
    compileOnly("com.intellectualsites.plotsquared:plotsquared-core")
    compileOnly("com.intellectualsites.plotsquared:plotsquared-bukkit") { isTransitive = false }
    compileOnly(project(":internal-api"))
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}