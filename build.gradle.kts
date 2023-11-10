plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.14"
}
repositories {
    mavenCentral()
}
dependencies {
}
javafx {
    version = "20"
    modules = listOf("javafx.controls")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>{
    options.encoding = "UTF-8"
}

application {
    mainClass.set("ca.qc.bdeb.sim203.tp2.Main")
}