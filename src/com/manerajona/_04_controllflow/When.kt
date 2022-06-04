package com.manerajona._04_controllflow

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var num = 200
    when (num) {
        100 -> println("one hundred")
        200 -> println("two hundred")
        300 -> println("three hundred")
        400 -> println("four hundred")
        500 -> println("five hundred")
        else -> println("does not match anything")
    }

    num = 4
    when (num) {
        100, 1 -> println("one hundred")
        200, 2 -> println("two hundred")
        300, 3 -> println("three hundred")
        400, 4 -> println("four hundred")
        500, 5 -> println("four hundred")
        else -> println("does not match anything")
    }

    num = 202
    when (num) {
        in 100..199 -> println("1xx")
        in 200..299 -> println("2xx")
        in 300..399 -> println("3xx")
        in 400..499 -> println("4xx")
        in 500..599 -> println("5xx")
        else -> println("does not match anything")
    }

    val state = States.PROCESSING
    when (state) {
        States.START -> println("operation started")
        States.PROCESSING -> println("processing...")
        States.FINISHED_SUCCESSFULLY -> exitProcess(0)
        States.FINISHED_WITH_ERRORS -> exitProcess(1)
    }

    val a = 2;
    val b = 3
    when {
        a > b -> println("a is greater")
        a < b -> println("b is greater")
        else -> println("a and b are equals")
    }

    val obj: Any = "string"
    when (obj) {
        is String -> println("is string")
        is Long -> println("is long")
        is Boolean -> println("is boolean")
        else -> println("is any")
    }

    for (o in arrayOf("hello", 1L, false, States.START)) {
        val aux = when (o) {
            is String -> o.toUpperCase()
            is Long -> o.inc()
            is Boolean -> o.not()
            else -> o
        }
        print("$aux, ")
    }

}

enum class States {
    START, PROCESSING, FINISHED_SUCCESSFULLY, FINISHED_WITH_ERRORS
}
