package variableScope;

/**
 * Name: Nigel Wilkerson
 * File: VariableScope.java
 * Version: 1.0
 * Date: 7/4/2026
 * Description: Demonstrates variable scope by declaring a static class-level variable
 *              that is accessible from any method within the class
 */

public class VariableScope {

    static String name = "Nigel";

    public static void main(String[] args) {

        greetCustomer();
    }
    static void greetCustomer(){
        System.out.printf("Good morning %s, welcome to the Pizza Store. \n", name);

    }
}
