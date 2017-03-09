package properties

import org.junit.Test
import org.assertj.core.api.KotlinAssertions.assertThat

data class FullName(val firstName: String, val lastName: String) {

    private val secret: String = "secret"

    val fullName: String
        get() = firstName + " " + lastName

    var highestScore: Int = 0
        set(value) {
            if (value > field) {
                field = value
            }
        }
}

class UniformPropertyAccess {

    @Test
    fun canAccessFullname() {
        var name = FullName("Hello", "World")

        assertThat(name.firstName).isEqualTo("Hello")
        assertThat(name.lastName).isEqualTo("World")
        assertThat(name.fullName).isEqualTo("Hello World")
    }

    @Test
    fun onlyRememberHighestScore() {
        var name = FullName("Hello", "World")

        assertThat(name.highestScore).isEqualTo(0)

        name.highestScore = 10
        assertThat(name.highestScore).isEqualTo(10)

        name.highestScore = 5
        assertThat(name.highestScore).isEqualTo(10)
    }
}