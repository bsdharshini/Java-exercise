import java.util.Scanner;

/*
 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
*/

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int number2 = sc.nextInt();
        System.out.println("Sum of two number is: "+(number1+number2));
        System.out.println("Subtraction of two number is: "+(number1-number2));
        System.out.println("Product of two number is: "+(number1*number2));
        System.out.println("Division of two number is: "+(number1/number2));
        System.out.println("Remainder of two number is: "+(number1%number2));
    }
    
}
