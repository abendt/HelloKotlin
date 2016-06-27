package testing

import demo.Hello
import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat

class KotlinJunit {

    @Test
    fun firstTest() {
        assertThat(Hello().hello()).isEqualTo("Hello World")
    }
}