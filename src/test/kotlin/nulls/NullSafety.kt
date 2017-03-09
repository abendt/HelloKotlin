package nulls

import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat
import kotlin.test.assertFailsWith
import kotlin.test.fail

class NullSafety {

    @Test
    fun explicitNull() {
        assertFailsWith<NullPointerException> {
            throw NullPointerException()
        }
    }

    @Test
    fun failWhenNull() {
        var value: String? = null

        assertFailsWith<NullPointerException> {
            value!!
            fail()
            println(value.length)
        }
    }

    @Test
    fun checkForNull() {
        var value: String? = null

        if (value != null) {
            fail()
            println(value.length)
        }
    }

    @Test
    fun safeCalls() {
        var good: String? = "hello"
        var bad: String? = null

        assertThat(good?.length).isEqualTo(5)
        assertThat(bad?.length).isNull()

        good?.let { println(it) }
        bad?.let { println(it) }
    }

    @Test
    fun elvis() {
        var good: String? = "hello"
        var bad: String? = null

        assertThat(good ?: "not").isEqualTo("hello")
        assertThat(bad ?: "not").isEqualTo("not")
    }

    @Test
    fun elvisCanBeUsedWithReturn() {
        var bad: String? = null

        val result = bad ?: return

        fail()
    }

    @Test
    fun elvisCanBeUsedWithThrow() {
        var bad: String? = null

        assertFailsWith<Exception> {
            val result = bad ?: throw Exception()
        }
    }

    fun test() : String  {
        return "test"
    }

    @Test
    fun testIt() {
        println(test())
    }
}