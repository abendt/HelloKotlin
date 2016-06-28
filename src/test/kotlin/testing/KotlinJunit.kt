package testing

import hello.HelloWorld
import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat
import kotlin.test.assertFailsWith

class KotlinJunit {

    @Test
    fun firstTest() {
        assertThat(HelloWorld().hello()).isEqualTo("Hello World")
    }

    @Test(expected = NullPointerException::class)
    fun expectFailure1() {
        throw NullPointerException()
    }

    @Test
    fun expectFailure2() {
        assertFailsWith<NullPointerException> {
            throw NullPointerException()
        }
    }
}