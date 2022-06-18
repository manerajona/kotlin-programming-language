package com.manerajona._08_io

import java.io.File
import java.lang.Thread.sleep

fun main(args: Array<String>) {
    // Reads this reader content as a list of lines.
    // NOTE: Do not use this function for huge files.
    File("resources/hey_jude_1.txt").reader()
        .readLines()
        .forEach {
            println(it)
            sleep(1500)
        }

    // Reads this file line by line using the specified charset and calls action for each line. Default charset is UTF-8.
    // You may use this function on huge files.
    File("resources/hey_jude_2.txt").forEachLine {
        println(it)
        sleep(1500)
    }

    // Calls the block callback giving it a sequence of all the lines in this file and closes the reader once the processing is complete.
    File("resources/hey_jude_2.txt").useLines { sequence ->
        sequence.forEach {
            println(it)
            sleep(1500)
        }
    }

    // Reads this reader completely as a String.
    // Note: It is the caller's responsibility to close this reader.
    val reader = File("resources/hey_jude_2.txt").reader()
    println(reader.readText())
    sleep(1500)
    reader.close()

    // Gets the entire content of this file as a String using UTF-8 or specified [charset].
    // Note: This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
    println(File("resources/hey_jude_2.txt").readText())
    sleep(1500)

    // Executes the given block function on this resource and then closes it down correctly whether an exception is thrown or not.
    val text = File("resources/hey_jude_3.txt").bufferedReader().use { it.readText() }
    println(text)
    sleep(1500)
}
