package com.manerajona._05_collections

fun main(args: Array<String>) {
    val inmutable = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(inmutable.javaClass)
    println(inmutable)

    val mutable = mutableMapOf("one" to "uno", "two" to "dos", "three" to "tres")
    println(mutable.javaClass)
    println(mutable)

    val hm = hashMapOf("one" to "un", "two" to "deux", "three" to "trois")
    println(hm.javaClass)
    println(hm)

    for ((key, value) in inmutable) {
        println("($key) $value")
    }
}
