package exercises;
import java.util.Scanner;


public class AreaOfRectangle {
    public static void main(String[] args){
        System.out.println("Calculate the area of a rectangle");
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?:");
        int length = input.nextInt();
        System.out.println("What is the width?:");
        int width = input.nextInt();
        System.out.println(length * width);
    }
}
