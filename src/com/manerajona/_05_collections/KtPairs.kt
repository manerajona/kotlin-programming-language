package com.manerajona._05_collections

fun main(args: Array<String>) {
    val pair = Pair(10, "ten")
    println(pair.first)
    println(pair.second)

    val (first, second) = pair
    println(first)
    println(second)

    val triad = Triad("blue", "yellow", "red")
    val (blue, yellow, red) = triad
    println(blue)
    println(yellow)
    println(red)

    val quartet = Quartet("green", "violet", "orange", "brown")
    val (green, violet, orange, brown) = quartet
    println(green)
    println(orange)
    println(violet)
    println(brown)
}

class Triad(private val first: String, private val second: String, private val third: String) {
    operator fun component1() = first
    operator fun component2() = second
    operator fun component3() = third
}

data class Quartet(val first: String, val second: String, val third: String, val fourth: String)
