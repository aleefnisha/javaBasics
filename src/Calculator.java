import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Choose the operator you want (+, -, *, /):");
        String operator = sc.nextLine();

        int result = 0;
        boolean validOperator = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                validOperator = false;
                break;
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}