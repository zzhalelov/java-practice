package exceptions.Task2;

public class Theatre extends Event {
    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public void validate() {
        if (title == null || releaseYear == 0 || age == 0) {
            throw new RuntimeException("Некорректное мероприятие: " + this);
        }
    }
}