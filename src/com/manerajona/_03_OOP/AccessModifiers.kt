package com.manerajona._03_OOP

fun main(args: Array<String>) {
    val foo1 = Foo1()
    val foo2 = Foo2()
    val foo3 = Foo3()
    val foo4 = Foo4()
}

// visible everywhere
public class Foo2

// same as public
class Foo1

// visible only within the same file
private class Foo3

// visible only to the module where they were declared
internal class Foo4
