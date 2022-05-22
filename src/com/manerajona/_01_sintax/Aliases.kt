package com.manerajona._01_sintax

private typealias PersonSet = Set<Person>

fun main(args: Array<String>) {

    val jane = Person("Jane Bar", 1)

    val personSet: PersonSet = hashSetOf(jane)

    if (personSet is PersonSet) {
        println("is true")
    }

    if (personSet is Set<*>) {
        println("is true")
    }

    if (personSet !is List<*>) {
        println("is true")
    }

    val personSetCopy1: Any = personSet
    val personSetCopy2 = personSetCopy1 as PersonSet

}

private class Person(var name: String, val id: Long)
