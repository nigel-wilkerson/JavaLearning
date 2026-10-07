package exceptionsPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: YourName.java
 * Version: 1.0
 * Date: 10/6/2026
 * Description:
 */

public class YourName {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("What's your name: ");
            String name = scanner.nextLine();

            System.out.println("Hello " + name + ".");

            System.out.print("What's your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            } else {
                System.out.println(name + ", you are " + age + " years old.");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please input a real number for age");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nThank you for using the program!");
        }
    }
}
