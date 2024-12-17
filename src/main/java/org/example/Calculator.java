package org.example;

public class Calculator {

    // Conversion constants
    private static final int MM_IN_CM = 10;
    private static final int MM_IN_DM = 100;
    private static final int MM_IN_M = 1000;
    private static final int MM_IN_KM = 1000000;

    public static int convertToMM(int value, String unit) {
        switch (unit) {
            case "mm":
                return value;
            case "cm":
                return value * MM_IN_CM;
            case "dm":
                return value * MM_IN_DM;
            case "m":
                return value * MM_IN_M;
            case "km":
                return value * MM_IN_KM;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + unit);
        }
    }

    public static int calculateExpression(String expression) {
        String[] terms = expression.split(" ");
        int resultInMM = 0;
        boolean addition = true; // Assume the first term is added

        for (int i = 0; i < terms.length; i++) {
            String term = terms[i];

            // Check if it's a number followed by a unit
            if (term.matches("[-+]?\\d+")) {
                int value = Integer.parseInt(term); // Convert value to integer
                String unit = terms[i + 1]; // The next term will be the unit

                // Convert value to millimeters
                int valueInMM = convertToMM(value, unit);

                // Apply the operator to the result
                if (i > 0 && terms[i - 1].equals("-")) {
                    resultInMM -= valueInMM;
                } else {
                    resultInMM += valueInMM;
                }
                i++; //
            }
        }
        return resultInMM; // Return result in millimeters
    }
}


