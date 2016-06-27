package testing

import demo.Hello
import org.assertj.core.api.KotlinAssertions.assertThat
import org.jetbrains.spek.api.Spek

class HelloSpek: Spek({
    given("Hello Spek") {
        on("the result of the hello method") {
            val hello = Hello().hello()

            it("should be hello world") {
                assertThat(hello).isEqualTo("Hello World")
            }

            it("should start with an capital letter") {
                assertThat(hello).startsWith("H")
            }
        }
    }
})