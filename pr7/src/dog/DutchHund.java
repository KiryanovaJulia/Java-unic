package dog;

public class DutchHund extends Dog{
    public DutchHund(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("ROUUUUUUUFFF!");
    }
}