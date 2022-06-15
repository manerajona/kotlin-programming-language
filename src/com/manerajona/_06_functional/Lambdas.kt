package com.manerajona._06_functional

fun main(args: Array<String>) {
    val students = listOf(
        Student("John", 2015),
        Student("Jane", 2020),
        Student("Mary", 2010)
    )

    findByName(students, "john")
    findByName(students, "jonathan")

    println(students.minBy { it.startYear })
    println(students.minBy(Student::startYear))

    println(countTo100())
    println(countTo101())

    // using labels
    "Hello".apply hello@{
        "World!".apply {
            print("${this@hello.toUpperCase()} ${this.toLowerCase()}")
        }
    }

}

data class Student(val name: String, val startYear: Int)

fun findByName(students: List<Student>, name: String) {
    students.forEach {
        if (it.name.equals(name, ignoreCase = true)) {
            println("Student found")
            return // exits the function
        }
    }
    println("Student not found")
}

// with operator
fun countTo100() = with(StringBuilder()) {
    for (i in 1..9) {
        append(i)
        append(", ")
    }
    append(10)
    toString()
}

// receiver object
fun countTo101() = StringBuilder().apply {
    for (i in 1..10) {
        append(i)
        append(", ")
    }
    append(11)
}.toString()
