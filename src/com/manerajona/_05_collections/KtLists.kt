package com.manerajona._05_collections

fun main(args: Array<String>) {

    // inmutable lists

    val seasons = listOf("summer", "fall", "winter", "spring")
    println(seasons.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val nullSafeList = listOfNotNull("1", 1, true, null)
    println(nullSafeList)

    // mutable lists

    val numbers = arrayListOf(1, 2, 3, 4, 5)
    numbers.add(6)
    println(numbers.javaClass)
    println(numbers)

    val ints: List<Int> = numbers.toList()
    println(ints.javaClass)
    println(ints)

    val seasonsMutable = seasons.toMutableList()
    seasonsMutable.add("new season")

    // functions
    println(seasons.last())
    println(seasons.first())

    println(seasons.asReversed())

    println(seasons.getOrNull(5))
    println(seasons.getOrElse(5) { "unknown" })

    val weather = listOf("sunny", "rainy", "snowy", "temperate")
    println(seasons.zip(weather))

    val colors = listOf("blue", "yellow", "red", "green", "blue", "yellow")

    println(colors.distinct())

    println(colors.all { it == "blue" })

    println(colors.any { it == "red" })

    println(colors.find { it == "yellow" })
    println(colors.find { it == "orange" })

    println(colors.filter { it.contains("l") })

    println(colors.groupBy { it.contains("l") })

    val evens = numbers.map { it * 2 }
    println(evens)

    println(evens.sortedBy { it < 10 })
}
