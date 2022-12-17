package dog;

public class Hasky extends Dog {

    public Hasky(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("ROUFF!");
    }
}
