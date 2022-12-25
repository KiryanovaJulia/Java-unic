import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Info myCurrency = new Info(17);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\prizm\\Desktop\\Lec.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(myCurrency);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\prizm\\Desktop\\Lec.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Info myCurrencyDeserialized = (Info) objectInputStream.readObject();
        System.out.println(myCurrencyDeserialized);
    }
}