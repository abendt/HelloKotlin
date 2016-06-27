package testing

import hello.HelloWorld
import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat

class KotlinJunit {

    @Test
    fun firstTest() {
        assertThat(HelloWorld().hello()).isEqualTo("Hello World")
    }
}