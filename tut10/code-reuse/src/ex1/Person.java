package ex1;

public class Person {
    // 1. Add the Fields
    private String name;
    private int age;

    // 2. Add the Constructor
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    // 3. Add the Properties
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    // 4. Add the Methods
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return sb.toString();
    }
}
