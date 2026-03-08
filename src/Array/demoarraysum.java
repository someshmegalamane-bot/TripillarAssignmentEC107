package Array;

public class demoarraysum {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;

        // Loop through the array and add elements
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Print the sum
        System.out.println("Sum of all elements in the array: " + sum);
    }
}