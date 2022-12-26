public class Woman extends Human {
    private final char gender;
    public Woman(int age, String name) {
        super(age, name);
        this.gender = 'W';
    }
    public char getGender() {
        return gender;
    }
    public void talk() {
        System.out.println("Hi! I'm woman!");
    }
}