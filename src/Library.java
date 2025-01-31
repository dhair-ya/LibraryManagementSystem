import java.util.ArrayList;
import java.util.Random;


public class Library {
    ArrayList<LibraryItem> libraryItems;
    Random random = new Random();

    void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
        System.out.println("Successfully added!");
    }

    int borrowItem(LibraryItem item) {
        //get inventory. if inventory>0, check for holds. if holds<inventory, borrow it to the user
        return random.nextInt(10000000, 99999999); //Confirmation id
    }

    void returnItem(LibraryItem item) {
        //add the item to the inventory
        System.out.println("Successfully returned!");
    }

    int reserveItem(LibraryItem item) {
        //get inventory. if holds<inventory, reserve it for them
        return random.nextInt(10000000, 99999999); //Reservation id
    }

    void cancelReservation(LibraryItem item) {
        //cancel reservation
        System.out.println("Reservation cancelled!");
    }
}
