package com.manerajona._02_datatypes

fun main(args: Array<String>) {

    var myInt = 10

    var myLong = 10L

    myInt = myLong.toInt()

    myLong = myInt.toLong()

    val myByte: Byte = myLong.toByte()

    var myDouble = 10.0

    val myFloat = 10.0f

    myDouble = myFloat.toDouble()

    var myChar = 'A'

    val myCharInt = 65

    myChar = myCharInt.toChar()

    var myAny: Any

    myAny = myInt

    myAny = myLong

    myAny = myFloat

    myAny = myDouble

    myAny = myChar

    myAny = "myString"

    myAny = true

    // do not expect a function to reach return
    val nothing: Nothing

    //nothing = myAny as Nothing

    // like void in java
    val myUnit: Unit
}
