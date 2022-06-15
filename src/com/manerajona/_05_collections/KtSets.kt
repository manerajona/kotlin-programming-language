package com.manerajona._05_collections

fun main(args: Array<String>) {
    val inmutable = setOf(1, 2, 3, 4, -10)
    println(inmutable.javaClass)

    println(inmutable.plus(5))
    println(inmutable.plus(4))
    println(inmutable.minus(1))
    println(inmutable.minus(10))
    println(inmutable.average())
    println(inmutable.drop(1))

    for (value in inmutable) {
        println(value)
    }
}
