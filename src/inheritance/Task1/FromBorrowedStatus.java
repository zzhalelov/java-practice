package inheritance.Task1;

public class FromBorrowedStatus extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE -> System.out.println("Book " + book.title + " moved to status " + requestedStatus);
            case ARCHIVED -> System.out.println("Book " + book.title + " move to status " + requestedStatus);
            case BORROWED -> System.out.println("Moving is impossible");
            case OVERDUED -> System.out.println("Book " + book.title + " moved status " + requestedStatus);
        }
    }
}