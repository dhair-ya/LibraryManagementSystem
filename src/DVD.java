public class DVD implements LibraryItem, Borrowable, Reservable{
    String title;
    int yearReleased;
    String director;

    DVD(String title, int yearReleased, String director) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return yearReleased;
    }

    public void displayDetails() {
        System.out.printf("The title of the DVD: %s\nThe release year of the DVD: %d\nThe director of the DVD: %s\n", title, yearReleased, director);
    }

    public void reserveItem() {
        //Check if DVD is available, if yes, check if there's no existing holds, if false, then reserve it
        System.out.println("The DVD has been reserved!");
    }

    public void cancelReservation() {
        //Cancel reservation
        System.out.println("You have successfully cancelled your reservation!");
    }

    public void borrowItem() {
        //Check if DVD is reserved for this user, if yes, borrow it to them
        System.out.println("You have successfully borrowed the DVD!");
    }

    public void returnItem() {
        //Accept the return and add it to your inventory
        System.out.println("Return completed successfully!");
    }
}
