package runtimeSchool.exceptions.Task2;

abstract class Event {
    protected String title;
    protected int releaseYear;
    protected int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public abstract void validate();

    @Override
    public String toString() {
        return "Название: " + title + ", Год выпуска: " + releaseYear + ", Ограничение по возрасту: " + age;
    }
}