package com.manerajona._04_controllflow

fun main(args: Array<String>) {

    print("Integer range: ")
    val range = 1..10
    for(i in range) print("$i, "); println()

    print("Char range: ")
    val charRange = 'a'..'z'
    for(c in charRange) print("$c, "); println()

    print("Backward range: ")
    val backwardRange = 10.downTo(0)
    for(i in backwardRange) print("$i, "); println()

    print("Reversed backward: ")
    for(i in backwardRange.reversed()) print("$i, "); println()

    print("String as range: ")
    for(c in "Hello World!".reversed()) print("$c, "); println()

    print("ArrayList as range: ")
    for(b in arrayListOf("John", "Paul", "George", "Ringo")) print("$b, "); println()

    print("Indices: ")
    for(index in LongArray(10).indices) print("$index, "); println()

    print("Step: ")
    for(i in 0..40 step 4) print("$i, "); println()

    print("Until: ")
    for(i in 5 until 10) print("$i, "); println()

    print("Break: ")
    iLoop@for(i in 1..10) {
        println("\ni$i")
        for(j in 1..10) {
            if(i == 3) break@iLoop
            print("j$j, ")
        }
    }

    print("Continue: ")
    iLoop@for(i in 1..3) {
        println("\ni$i")
        for(j in 1..10) {
            if(j > 5) continue@iLoop
            print("j$j, ")
        }
    }
}
