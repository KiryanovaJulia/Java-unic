public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        //factory.CreateComplex(2, 3);
        System.out.println(factory.CreateComplex(2, 3));
    }}