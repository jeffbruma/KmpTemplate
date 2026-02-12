package com.jeffbruma.kmptemplatejdk25gradle9kotlin2

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}