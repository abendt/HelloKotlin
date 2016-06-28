package extension_functions

import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test

fun String.hello(): String = "Hello " + this

class ExtensionFunctions {
    @Test
    fun canExtendExistingClass() {
        val result = "World".hello()

        assertThat(result).isEqualTo("Hello World")
    }
}