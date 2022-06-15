package com.manerajona._06_functional

fun main(args: Array<String>) {
    val weather = listOf("sunny", "rainy", "snowy", "temperate")

    // similar to Streams
    val seq = weather.asSequence()
        .filter { println("filtering..."); it.startsWith("s") }
        .map { println("mapping..."); it.toUpperCase() }

    println(seq.first())
    println(seq.last())
}
