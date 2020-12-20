import java.util.Scanner;

//Write a Java program that takes a number as input and prints its multiplication table upto 10
public class Problem7 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number:");
     int number = sc.nextInt();
    for(int i=1;i<=number;i++)
    {
        System.out.println(number+" x "+i+" = "+(number*i));
    }
 }   
}
