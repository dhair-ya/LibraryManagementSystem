public class Book implements LibraryItem, Borrowable{
    String title;
    int yearPublished;
    String author;

    Book(String title, int yearPublished, String author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return yearPublished;
    }

    public void displayDetails() {
        System.out.printf("The title of the book: %s\nThe release year of the book: %d\nThe author of the book: %s\n", title, yearPublished, author);
    }

    public void borrowItem() {
        //Do some admin stuff to borrow this book to the user
        System.out.println("Successfully borrowed! Please return within three weeks.");
    }

    public void returnItem() {
        //Admin stuff to reallocate the book to Library's inventory
        System.out.println("Successfully returned!");
    }
}
