import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            System.out.println(person);
        } catch (NameUndefinedException e) {
            e.getMessage();
        } catch (IncorrectAgeException e) {
            e.getMessage();
        }
        catch (InputMismatchException e){
            System.err.println("Nie poprawnie wpisane dane");
        }
        scanner.close();
        System.out.println("za");

    }
}
