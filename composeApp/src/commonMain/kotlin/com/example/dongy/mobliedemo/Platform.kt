package com.example.dongy.mobliedemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform