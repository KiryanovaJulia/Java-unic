package dog;

public abstract class Dog {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void sound();

    public void defend() {
        System.out.println("Is defending owner!");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}