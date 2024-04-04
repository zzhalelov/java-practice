package runtimeSchool.abstractionsAndInterfaces.Task1;

public class UserReader extends User implements Reader, Librarian {
    private String name;

    public UserReader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void orderBook() {
        System.out.printf("Читатель %s заказывает книги для библиотеки", getName());
        System.out.println();
    }

    @Override
    public void takeBook() {
        System.out.printf("Читатель %s берёт книги из библиотеки", getName());
        System.out.println();
    }

    @Override
    public void returnBook() {
        System.out.println();
    }
}