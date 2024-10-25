
abstract class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayInfo();
}

class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + "), Genre: " + genre);
    }
}

class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + "), Subject: " + subject);
    }
}

public class Library {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("1984", "George Orwell", 1949, "Dystopian");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 2011, "History");

        fictionBook.displayInfo();
        nonFictionBook.displayInfo();
    }
}
