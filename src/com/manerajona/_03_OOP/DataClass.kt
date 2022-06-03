package com.manerajona._03_OOP

fun main(args: Array<String>) {
    val fiat1 = Car("white", "Fiat", 2013)
    val fiat2 = Car("white", "Fiat", 2013)

    // override toString
    println(fiat1)
    println(fiat2)

    // override hashcode
    println(fiat1.hashCode())
    println(fiat2.hashCode())

    // override equals
    println(fiat1 == fiat2)

    var fiat3 = fiat1.copy()
    println(fiat3)

    fiat3 = fiat1.copy(color = "grey")
    println(fiat3)
}

data class Car(val color: String, val brand: String, val year: Int)
