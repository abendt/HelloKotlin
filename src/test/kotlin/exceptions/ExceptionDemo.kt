package exceptions

import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat

class ExceptionDemo {

    fun throwsException() {
        throw CheckedException()
    }

    @Test
    fun canCatchException() {
        try {
            throwsException()
        } catch (e: CheckedException) {
            println("exception")
        } finally {
            println("finally")
        }
    }

    @Test
    fun tryIsAnExpression() {
        val result = try {
            throwsException()
            10
        } catch (e: CheckedException) {
            20
        }

        assertThat(result).isEqualTo(20)
    }
}