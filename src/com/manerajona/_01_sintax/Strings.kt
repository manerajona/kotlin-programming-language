package com.manerajona._01_sintax

fun main(args: Array<String>) {

    val firstName = "Foo"
    val lastName = "Bar"

    val fullName = "$firstName $lastName"

    println(fullName)

    val a = 2f
    val b = 3f

    println("a + b is ${a + b}")
    println("b - a is ${b - a}")
    println("b times a is ${b * a}")
    println("a divided b is ${a / b}")

    var rectangle = """***********************
*                     *
*                     *
*                     *
*                     *
***********************"""

    println(rectangle)

    rectangle = """
    |***********************
    |*                     *
    |*                     *
    |*                     *
    |*                     *
    |***********************
    """.trimMargin()

    println(rectangle)

    val json = """
    *{
    *   "name": "$fullName",
    *   "start_date": "2022-04-14T11:34:51.163Z",
    *   "skills": [1, 2, 3]
    *}
    """.trimMargin("*")

    println(json)
}
