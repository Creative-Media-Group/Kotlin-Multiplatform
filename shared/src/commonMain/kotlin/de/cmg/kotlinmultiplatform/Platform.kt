package de.cmg.kotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform