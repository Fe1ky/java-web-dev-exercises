package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Search for and remove a word in the first sentence of Alice’s Adventures in Wonderland");
        String word = input.nextLine();

     if(sentence.contains(word)){
         System.out.println(sentence.indexOf(word));
         System.out.println(word.length());

         String newSentence = sentence.replaceAll(word,"");
         System.out.println(newSentence);
     } else {
         System.out.println(sentence.contains(word));
     }




    }
}
