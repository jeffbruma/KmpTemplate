package com.jeffbruma.kmptemplatejdk25gradle9kotlin2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform