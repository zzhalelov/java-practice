package runtimeSchool.abstractionsAndInterfaces.Task1;
//Необходимо разработать иерархию работников библиотеки. Нужно реализовать совмещение нескольких ролей в библиотеке в одном исполнителе через интерфейсы. Каждый объект в программе имеет определенный набор действий. Для передачи информации о том, что должен уметь объект, используются интерфейсы
//It is necessary to develop a hierarchy of library employees. It is necessary to implement the combination of several roles in the library in one performer through interfaces. Each object in the program has a specific set of actions. Interfaces are used to convey information about what an object should be able to do
public class Main {
    public static void main(String[] args) {
        UserReader userReader = new UserReader("Aidos");
        userReader.orderBook();
        userReader.takeBook();
        UserAdministrator userAdministrator = new UserAdministrator("Zhandos");
        userAdministrator.overdueNotification(userReader);
        userAdministrator.returnBook();
    }
}