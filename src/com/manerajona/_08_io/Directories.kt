package com.manerajona._08_io

import java.io.File
import java.lang.Thread.sleep

fun main(args: Array<String>) {

    File("./resources").walkTopDown()
        .forEach { println(it); sleep(500) }

    println()

    File("./resources").walkBottomUp()
        .filter { it.name.startsWith("hey_jude") }
        .forEach { println(it.readText()); sleep(500) }
}
