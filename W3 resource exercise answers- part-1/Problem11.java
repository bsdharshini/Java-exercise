import java.util.Scanner;

//Write a Java program to print the area and perimeter of a circle
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius:");
        float radius = sc.nextFloat();
        System.out.println("Area of circle is: "+((Math.PI)*(Math.pow(radius, 2))));
        System.out.println("Perimeter of circle is: "+(2*(Math.PI)*radius));

        
    }
}
