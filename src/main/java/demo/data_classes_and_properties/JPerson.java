package demo.data_classes_and_properties;

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

        JPerson jPerson = (JPerson) o;

        if (getAge() != jPerson.getAge()) return false;
        return getName() != null ? getName().equals(jPerson.getName()) : jPerson.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "JPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}