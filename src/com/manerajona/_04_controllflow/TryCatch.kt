package com.manerajona._04_controllflow

fun main(args: Array<String>) {
    println(toNumberOrZero("12"))
    println(toNumberOrZero("12.6"))

    println(toNumber("") ?: "unprocessable operation")
}

fun toNumberOrZero(str: String) = try {
    Integer.parseInt(str)
} catch (e: Exception) {
    0
} finally {
    println("just checking")
}

fun toNumber(str: String): Int? = try {
    Integer.parseInt(str)
} catch (e: Exception) {
    null
}
