package demo.data_classes_and_properties;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class JPerson {

    private final String name;
    private final int age;

    public JPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JPerson that = (JPerson) o;

        return Objects.equal(this.name, that.name) &&
                Objects.equal(this.age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }
}