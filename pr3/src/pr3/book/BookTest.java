package pr3.book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("The Master and Margarita");
        book.setAuthor("Mikhail Bulgakov");
        book.setGenre("Fantasy");
        book.setYear(1967);

        System.out.println(book);
    }
}
