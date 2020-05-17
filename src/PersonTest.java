import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                System.out.println("Podaj imie:");
                String name = scanner.nextLine();
                System.out.println("Podaj nazwisko:");
                String lastName = scanner.nextLine();
                System.out.println("Podaj wiek:");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj pesel:");
                String id = scanner.nextLine();
                Person person = new Person(name, lastName, age, id);
                error = false;
                System.out.println(person);
            } catch (NameUndefinedException e) {
                System.out.println(e.getMessage());
            } catch (IncorrectAgeException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Nie poprawnie wpisane dane");
            }
        } while (error);
        scanner.close();


    }
}
