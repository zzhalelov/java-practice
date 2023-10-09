package inheritance.Task1;

//Необходимо с помощью наследования реализовать программу, в которой будет 4 наследника базового класса Bookcover по переводу статуса книги из одного в другой. Данный функционал пригодится в случае массового перевода книг в какой-то статус, но мы пока рассмотрим перевод только одной книги
//It is necessary to use inheritance to create a program in which there will be 4 inheritors of the Bookcover base class to transfer the status of a book from one to another. This functionality will be useful in the case of a mass transfer of books to some status, but for now we will consider the translation of only one book
public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatus = new FromAvailableStatus();
        fromAvailableStatus.moveToStatus(book, Status.ARCHIVED);
        Book book1 = new Book("Harry Potter");
        BookMover fromBorrowedStatus = new FromBorrowedStatus();
        fromBorrowedStatus.moveToStatus(book1, Status.AVAILABLE);
    }
}