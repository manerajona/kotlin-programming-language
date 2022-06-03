package com.manerajona._02_datatypes

import java.util.stream.IntStream

fun main(args: Array<String>) {

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val longs3 = longArrayOf(1, 2, 3)
    val longs4: Array<Long> = arrayOf(1, 2, 3)
    val longs5 = LongArray(3)
    longs5[0] = 1
    longs5[0] = 2
    longs5[0] = 3

    for (i in longs1) {
        println(i)
    }

    for (i in longs1.reversed()) {
        println(i)
    }

    val mixed = arrayOf<Any>("John", 'A', 1L, true)

    IntStream.rangeClosed(0, 3).forEach { i -> println(mixed[i]) }

    val names = arrayOf("Joh", "Jane", "Joe")

    IntStream.rangeClosed(0, 2).forEach { i -> println(names[i]) }

    val evenNumbers = Array(15) { it * 2 }

    Array(15) { println(evenNumbers[it]) }
}
