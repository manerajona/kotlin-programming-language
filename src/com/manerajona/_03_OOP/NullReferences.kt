package com.manerajona._03_OOP

fun main(args: Array<String>) {

    // ? means it is nullable
    val str1: String? = "Nullable string"

    if (str1 != null) {
        println(str1.toUpperCase())
    }

    // NULL-SAFE
    var str2: String? = null
    println(str2?.toUpperCase())

    str2 = str1
    println(str2?.toUpperCase())

    // The Elvis ?: is useful to assign default values
    val str3: String? = null
    println(str3 ?: "Default Message".toUpperCase())

    // CAST-SAFE
    val something: Any = arrayOf('A', 'B', 'C')
    val str4 = something as? String
    println(str4?.toUpperCase())

    // The 'let' op is useful to execute a null-safe block of code
    str1?.let { someOperation(str1) }
    str4?.let { someOperation(str4) }

    // The non-null assertion !! is useful to stop the execution in case of null
    println(str4!!.toUpperCase())

    someOperation("Other operation") // never happen
}

fun someOperation(arg0: String) {
    println("Executing: ${arg0.toUpperCase()}")
}
