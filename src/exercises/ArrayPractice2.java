package exercises;
import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args){
        String someString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = someString.split("\\.");
        System.out.println(Arrays.toString(wordArray));
    }

}