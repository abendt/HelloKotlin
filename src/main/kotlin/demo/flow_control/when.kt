package demo.flow_control

import demo.nullable_types_and_interop.Client

fun main(args: Array<String>) {

    case2(Test("torsten"))
    case2(Test("torsten2"))
}

fun case2(obj: Test) {
    when(obj) {
        Test("torsten") -> println("Torsten")
        else -> println("Unknown")
    }
}

data class Test(val name: String)

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}