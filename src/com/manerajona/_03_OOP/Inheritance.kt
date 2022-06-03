package com.manerajona._03_OOP

fun main(vararg args: String) {
    val foo = FooChild("foo")
    foo.sayHello()
    foo.sayBye()

    val fooGrandChild = FooGrandChild("foo")
    fooGrandChild.sayHello()
}

abstract class FooParent(val name: String) {
    open fun sayHello() = println("Hello $name")
    abstract fun sayBye()
}

open class FooChild(name: String) : FooParent(name) {
    final override fun sayBye() = println("Bye $name")
}

class FooGrandChild(name: String) : FooChild(name) {
    override fun sayHello() = println("Bonjour le $name")
    //override fun sayBye() = println("Au revoir le $name") compilation error
}
