package runtimeSchool.exceptions.Task2;

public class Movie extends Event {
    public Movie(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public void validate() {
        if (title == null || releaseYear == 0 || age == 0) {
            throw new RuntimeException("Некорректное мероприятие: " + this);
        }
    }
}