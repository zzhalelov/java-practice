package abstractionsAndInterfaces.Task1;

public class UserAdministrator extends User implements Administrator, Reader {
    private String name;

    public UserAdministrator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void findBook() {

    }

    @Override
    public void giveoutBook() {

    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.printf("Администратор %s уведомил читателя %s о просрочке", getName(), getName());
        System.out.println();
    }

    @Override
    public void takeBook() {
        System.out.println();
    }

    @Override
    public void returnBook() {
        System.out.printf("Администратор %s возвращает книгу", getName(), getName());
    }
}