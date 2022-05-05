package com.lifefighter.dependencies.printer

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesProjectPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val rootProject = project.rootProject
        if (rootProject == project) {
            println("hello world!")
        } else {
            println("hello world!")
        }
    }
}