package com.manerajona._03_OOP

fun main(args: Array<String>) {
    val bar1 = Bar1("Bar One")
    println(bar1.arg0)

    val bar2 = Bar2("Bar Two")
    println("${bar2.arg0}, ${bar2.arg1}")

    val bar21 = Bar2("Bar", "Two")
    println("${bar21.arg0}, ${bar21.arg1}")

    val bar31 = Bar3("Bar", false)
    println("${bar31.arg0}, ${bar31.isActive}")

    val bar32 = Bar3()
    println("${bar32.arg0}, ${bar32.isActive}")

    bar32.arg0 = "hello"
    bar32.isActive = false
    println("${bar32.arg0}, ${bar32.isActive}")

}

class Bar1(val arg0: String)

class Bar2(val arg0: String, var arg1: String = "default value")

class Bar3(var arg0: String = "", isActive: Boolean = true) {
    var isActive = isActive
        get() {
            if (!field) {
                println("The resource is inactive!")
            }
            return field
        }
        set(value) {
            if (!value) {
                println("Soft-deleting resource...")
            }
            field = value
        }
}

class Singleton private constructor(val arg0: String)
