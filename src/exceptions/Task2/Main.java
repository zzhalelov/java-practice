package exceptions.Task2;

//подготовим список событий - такими событиями могут быть фильмы/спектакли. Если любое из полей прочитанного объекта равно null или 0 (для целочисленных полей), нужно выбросить RuntimeException и завершить работу программы, если ошибок не возникло - вывести сообщение "Все события корректны".
//prepare a list of events - such events can be films/performances. If any of the fields of the read object is null or 0 (for integer fields), you need to throw a RuntimeException and terminate the program, if there are no errors, output the message "All events are correct".
public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
            System.out.println(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
            System.out.println(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Inception", 2010, 16),
                new Movie("Titanic", 1997, 18),
                new Movie("Avatar", 2009, 14)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Гамлет", 2005, 16),
                new Theatre("Евгений Онегин", 1997, 18)
        };
    }

    public static void validEvent(Event event) {
        event.validate();
    }
}