import org.gradle.api.internal.ConventionTask

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

}

plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}

tasks.register("hello") {
    doLast {
        println("Hello World")
    }
}
