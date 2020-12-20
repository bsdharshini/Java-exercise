
//Write a Java program to divide two numbers and print on the screen

import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int number2 = sc.nextInt();
        System.out.println("Division of two number is: "+(number1/number2));
    }
}
