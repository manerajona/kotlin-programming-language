package com.manerajona._03_OOP

fun main(args: Array<String>) {

    val emp1 = Employee("John Foo", 1)
    emp1.name = "Jane Bar"

    val emp2 = Employee("Jane Bar", 1)

    val emp3 = Employee("John Foo", 2)

// structural equality

    println(emp1 == emp2)
    println(emp1 == emp3)
    println(emp1 != emp3)

    println(emp1.equals(emp2))
    println(emp1.equals(emp3))
    println(!emp1.equals(emp3))

// referencial equality

    val emp4 = emp1

    println(emp1 === emp2)
    println(emp1 === emp4)
    println(emp1 !== emp4)
}

private class Employee(var name: String, val id: Long) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }
}
