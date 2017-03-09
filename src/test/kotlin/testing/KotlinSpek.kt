package testing

import hello.HelloWorld
import org.assertj.core.api.KotlinAssertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
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