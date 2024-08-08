package de.cmg.kotlinmultiplatform

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Multiplatform",
    ) {
        App()
    }
}