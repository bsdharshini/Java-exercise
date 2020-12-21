import java.util.Scanner;
//Write a Java program to swap two variables.
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        int c;
        System.out.println("Before swapping -> A is "+a+" B is "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping -> A is "+a+" B is "+b);
    }
}
