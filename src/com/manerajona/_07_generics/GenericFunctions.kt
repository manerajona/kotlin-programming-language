package com.manerajona._07_generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val strings = mutableListOf("one", "two", "three")
    printCollection(strings)
    strings.print()

    val numbers = mutableListOf(1L, 2L, 3L)
    printCollection(numbers)
    printNonNullable(numbers)

    val b: Boolean = numbers is List<Number>
    println(b)

    val shorts: List<Short?> = listOf(1, 2, 3, 4, 5)
    printCollection(shorts)
    //printNonNullable(shorts) ERROR

    println(numbers.total())

    // Reified generic
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.393849))
    getElementsOfType<String>(mixedList).forEach { println(it) }
}

fun <T> printCollection(col: List<T>) = col.forEach { println(it) }

fun <T> List<T>.print() = this.forEach { println(it) }

fun <T : Any> printNonNullable(col: List<T>) = col.forEach { print(it) }

fun <T : Number> List<T>.total(): Number = this.sumBy { it.toInt() }

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    list.forEach {
        if (it is T) {
            newList.add(it)
        }
    }
    return newList
}
