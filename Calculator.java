package src;

	import java.util.Scanner;

	public class Calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Displaying options to the user
	        System.out.println("Simple Calculator");
	        System.out.println("Choose an operation:");
	        System.out.println("1: Addition");
	        System.out.println("2: Subtraction");
	        System.out.println("3: Multiplication");
	        System.out.println("4: Division");

	        // Taking input for the operation choice
	        int choice = scanner.nextInt();

	        // Taking input for the two numbers
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        double result = 0;
	        boolean validOperation = true;

	        // Performing the operation based on user choice
	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                // Handling division by zero
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error! Division by zero.");
	                    validOperation = false;
	                }
	                break;
	            default:
	                System.out.println("Invalid operation choice.");
	                validOperation = false;
	                break;
	        }

	        // Displaying the result
	        if (validOperation) {
	            System.out.println("The result is: " + result);
	        }
	        
	        // Closing the scanner
	        scanner.close();
	    }
	}
