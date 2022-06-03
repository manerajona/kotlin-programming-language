package com.manerajona._03_OOP

import java.time.Year

fun main(args: Array<String>) {
    println(Footer.getTagLine())
    println(Footer.getCopyrightLine())
    println(SomeClass.accessPrivateVar())
    println(SomeClass.Constants.accessPrivateVar())

    // anonymous objects
    printOutput(object : Producer {
        override fun pull(): Any = "output"
    })

}

// singleton
object Footer {
    private val currentYear = Year.now()
    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"
}

// companion object
class SomeClass {
    companion object Constants {
        private const val privateVar = "I'm so private"
        fun accessPrivateVar() = privateVar
    }
}

interface Producer {
    fun pull(): Any
}

fun printOutput(producer: Producer) = println(producer.pull())
