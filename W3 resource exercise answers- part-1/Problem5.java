import java.util.Scanner;

//Write a Java program that takes two numbers as input and display the product of two numbers
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int number2 = sc.nextInt();
        System.out.println("Product of two number is: "+(number1*number2));  
    }
}
