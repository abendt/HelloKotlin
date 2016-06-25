package demo.flow_control

import demo.nullable_types.Client

fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(Client())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}