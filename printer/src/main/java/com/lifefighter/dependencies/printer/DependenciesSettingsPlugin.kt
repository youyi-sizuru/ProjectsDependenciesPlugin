package com.lifefighter.dependencies.printer

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class DependenciesSettingsPlugin : Plugin<Settings> {
    override fun apply(settings: Settings) {
        println("hello world!")
    }
}