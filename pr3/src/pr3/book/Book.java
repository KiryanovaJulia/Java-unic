package pr3.book;

public class Book {
    private String name, author, genre;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book's name: " + name + '\n'
                + "Book's author: " + author + '\n'
                + "Book's genre: " + genre + '\n'
                + "Book's year: " + year;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.name = "The Master and Margarita";
        book.author = "Mikhail Bulgakov";
        book.genre = "Fantasy";
        book.year = 1967;

        System.out.println(book);
    }
}

