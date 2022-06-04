package com.manerajona._04_controllflow

fun main(args: Array<String>) {

    val num = if (1 != 2) 1 else 2
    println(num)

    val output = if (1 != 2) {
        println("is true")
        "one"
    } else {
        println("is false")
        "two"
    }
    println(output)

}
