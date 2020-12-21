import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int number2 = sc.nextInt();
        System.out.print("Enter number 3:");
        int number3 = sc.nextInt();
        System.out.println("Average of three number is: "+((number1+number2+number3)/3));
    }
}
