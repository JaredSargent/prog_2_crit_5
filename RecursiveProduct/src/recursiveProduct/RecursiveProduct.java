package recursiveProduct;

import java.util.Scanner;

public class RecursiveProduct {
    // Recursive method to calculate the product of numbers in an array
    public static double calculateProduct(double[] numbers, int index) {
        // Base case: if index is 0, return the first number
        if (index == 0) {
            return numbers[0];
        }
        // Recursive case: multiply current number by product of previous numbers
        return numbers[index] * calculateProduct(numbers, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5]; // Array to store 5 numbers

        // Prompt user to enter five numbers
        System.out.println("Please enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate product using recursive method
        double product = calculateProduct(numbers, numbers.length - 1);

        // Display the result
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }
}