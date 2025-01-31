public class Main {
    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", 2012, "James Clear");
        DVD dvd = new DVD("Paradise", 2008, "Chris Martin");
        Library library = new Library();

        //Adding to the library
        library.addLibraryItem(book);
        library.addLibraryItem(dvd);

        //Borrowing the book and reserving the dvd
        book.borrowItem();
        dvd.reserveItem();

        //Cancelling reservation and returning the book
        book.returnItem();
        dvd.cancelReservation();

        //Borrowing the dvd
        dvd.borrowItem();

        //Returning the dvd
        dvd.returnItem();
    }
}