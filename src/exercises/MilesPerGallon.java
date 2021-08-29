package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many Miles?:");
        int miles = input.nextInt();
        System.out.println("How many gallons?:");
        int gallons = input.nextInt();
        System.out.println( miles / gallons);
    }
}
