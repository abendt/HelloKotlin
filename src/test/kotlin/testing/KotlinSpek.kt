package testing

import hello.HelloWorld
import org.assertj.core.api.KotlinAssertions.assertThat
import org.jetbrains.spek.api.Spek

class KotlinSpek : Spek({
    given("Hello Spek") {
        on("the result of the hello method") {
            val hello = HelloWorld().hello()

            it("should be hello world") {
                assertThat(hello).isEqualTo("Hello World")
            }

            it("should start with an capital letter") {
                assertThat(hello).startsWith("H")
            }
        }
    }
})