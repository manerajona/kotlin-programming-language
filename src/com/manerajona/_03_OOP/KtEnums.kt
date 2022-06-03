package com.manerajona._03_OOP

fun main(args: Array<String>) {
    println(States.START)
    println("${StatusCode.ACCEPTED} (${StatusCode.ACCEPTED.code})")
    println(States.PROCESSING)
    println("${StatusCode.OK} (${StatusCode.OK.code})")
    println(States.FINISHED_SUCCESSFULLY)
    println()
    println(States.START)
    println("${StatusCode.ACCEPTED} (${StatusCode.ACCEPTED.code})")
    println(States.PROCESSING)
    println("${StatusCode.INTERNAL_SERVER_ERROR} (${StatusCode.INTERNAL_SERVER_ERROR.code})")
    println(States.FINISHED_WITH_ERRORS)
}

enum class States {
    START, PROCESSING, FINISHED_SUCCESSFULLY, FINISHED_WITH_ERRORS
}

enum class StatusCode(val code: Int) {
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NO_CONTENT(204),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500),
    SERVICE_UNAVAILABLE(503)
}
