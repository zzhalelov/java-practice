package inheritance.Task1;

public class FromAvailableStatus extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED -> System.out.println("Book " + book.title + " moved to status " + requestedStatus);
            case BORROWED -> System.out.println("Book " + book.title + " move to status " + requestedStatus);
            case OVERDUED -> System.out.println("Moving is impossible");
        }
    }
}