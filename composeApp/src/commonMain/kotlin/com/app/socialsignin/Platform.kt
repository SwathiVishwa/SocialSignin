package com.app.socialsignin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform