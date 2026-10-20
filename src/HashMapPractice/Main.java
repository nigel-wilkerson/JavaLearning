package HashMapPractice;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 10/19/2026
 * Description: HashMap practice program that collects employee names and IDs from user input,
 *              stores them in a HashMap, and prints each employee's name and ID.
 * Notes :  put(key, value) — store a pair
 *          get(key) — retrieve the value for a key
 *          remove(key) — delete the pair
 *          containsKey(key) — is this key in the map?
 *          containsValue(value) — is this value in the map?
 *          size() — how many pairs
 *          keySet() — all the keys as a Set
 *          values() — all the values as a Collection
 */

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            HashMap<Integer, String> employees = new HashMap<>();

            // Declare variables
            String names;
            int numOfEmployees;
            int idNumber;

            // Ask user how many employees they have
            System.out.print("How many employees do you have? ");
            numOfEmployees = scanner.nextInt();
            scanner.nextLine();

            // If employees is less than 0 throw illegal argument exception
            if (numOfEmployees <= 0){
                throw new IllegalArgumentException("The number of employees must be greater than 0.");
            }

            // For every employee ask for their name, id number, and input that info into the hashmap
            for (int i = 1; i <= numOfEmployees; i++){
                System.out.printf("What is employee %d's name: ", i);
                names = scanner.nextLine();

                System.out.printf("What is employee %d's id number: ", i);
                idNumber = scanner.nextInt();
                scanner.nextLine();

                employees.put(idNumber, names);

            }

            // Print each employee id number and name
            for (Integer key : employees.keySet()){
                System.out.printf("ID Number: %d | Name: %s%n", key, employees.get(key));
        }

        } //Exceptions
        catch (InputMismatchException e ){
            System.out.println("Please try again your input was wrong.");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong, please try again.");
        }
    }
}
