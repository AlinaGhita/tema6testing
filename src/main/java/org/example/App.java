package org.example;

import static org.example.Calculator.calculateExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        // Example usage
        String expression = "10 cm + 1 m - 10 mm";
        int result = calculateExpression(expression);
        System.out.println("Result: " + result + " mm");
    }

}
