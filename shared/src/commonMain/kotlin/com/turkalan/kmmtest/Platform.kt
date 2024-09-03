package com.turkalan.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform