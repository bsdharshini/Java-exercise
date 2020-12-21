import java.util.Scanner;

//Write a Java program to print the area and perimeter of a rectangle
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float length = sc.nextFloat();
        System.out.print("Enter the width: ");
        float width = sc.nextFloat();
        System.out.println("Area of the rectangle is: "+(length*width));
        System.out.println("Perimeter of the rectangle is: "+(2*(length+width)));
    }
}
