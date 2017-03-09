package builder

import org.junit.Test

class BuilderDemo {

    @Test
    fun builder() {
        builder {
            // this zeigt auf den Builder
            println(this)

            for (i in 0..2) {
                buildSomething()
            }

            teilweiseOptional("name") {
                println(this)
            }
        }
    }

    fun builder(init: Builder.() -> Unit): Builder {
        val builder = Builder()
        builder.init()
        return builder
    }

    class Builder {
        override fun toString() = "i am the Walrus"

        fun buildSomething() {
            println("building")
        }

        fun teilweiseOptional(name: String, init: Optional.() -> Unit): Optional {
            val opt = Optional()
            opt.init()
            return opt
        }
    }

    class Optional {

    }
}