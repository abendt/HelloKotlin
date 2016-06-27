package hello

class HelloWorld {
    fun hello() = "Hello World"
}

fun main(args : Array<String>) {
    println(HelloWorld().hello() + " from Kotlin!")
}