[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/neyKa3b8)
import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        // Example input as string array
        String[] inputNumbers = {"10", "20", "30", "40", "50"};
        
        // Parsing strings into Integer objects and adding to the list (autoboxing)
        for (String num : inputNumbers) {
            numbers.add(parseInteger(num));
        }
        
        // Calculating the sum using unboxing
        int sum = calculateSum(numbers);
        
        // Display the result
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to parse a string into an Integer
    private static Integer parseInteger(String str) {
        return Integer.parseInt(str); // Autoboxing converts int to Integer
    }

    // Method to calculate sum using unboxing
    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing Integer to int
        }
        return sum;
    }
}
