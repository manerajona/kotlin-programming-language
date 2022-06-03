package com.manerajona._03_OOP

fun main(args: Array<String>) {
    val child: ChildInterface
    child = ChildInterfaceImpl()
    println(child.someOperation("read"))
    println(child.otherOperation("write"))
}

interface ParentInterface {
    val numberOfExec: Int

    fun someOperation(name: String): String
}

interface ChildInterface : ParentInterface {
    override val numberOfExec: Int
        get() = 10

    fun otherOperation(name: String): String
}

class ChildInterfaceImpl : ChildInterface {

    override fun otherOperation(name: String): String {
        return "executing operation $name, $numberOfExec times"
    }

    override fun someOperation(name: String): String {
        return "executing operation $name, $numberOfExec times"
    }

}
