package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        try {
            Person person = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person);
            person.setAge(-10);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Koniec programu");
        }

    }
}
