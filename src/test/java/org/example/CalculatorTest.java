package org.example;

//import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class CalculatorTest {

    @org.junit.jupiter.api.Test
    //1 input
    void convertToMM() {
        assertEquals(9000, Calculator.convertToMM(9, "m"));
    }

    @Test
    void convertToMM1() {
        //2 inputs
        assertEquals(600, Calculator.convertToMM(60, "cm"));
        assertEquals(15000000, Calculator.convertToMM(15, "km"));
    }

    @org.junit.jupiter.api.Test
    void calculateExpression() {
        //1 input
        String expression = "10 cm ";
        int result = Calculator.calculateExpression(expression);
        assertEquals(100, result);
    }
    @org.junit.jupiter.api.Test
    void  calculateExpression1() {
        //exemple
        String expression = "10 cm + 1 m - 10 mm";
        int result = Calculator.calculateExpression(expression);
        assertEquals(1090, result);
    }

    @org.junit.jupiter.api.Test
    void  calculateExpression2() {
        //2 inputs and addition operation
        String expression = "10 cm + 1 m";
        int result = Calculator.calculateExpression(expression);
        assertEquals(1100, result);
    }

    @org.junit.jupiter.api.Test
    void  calculateExpression3() {
        //2 inputs and subtraction operation
        String expression = "1 m - 10 cm";
        int result = Calculator.calculateExpression(expression);
        assertEquals(900, result);
    }

}