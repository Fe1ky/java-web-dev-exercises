package exercises;

public class ArrayPractice1 {

    public static void main(String[] args){
        int[] someInts = {1,1,2,3,5,8};
    for(int i = 0; i< someInts.length;i++){
       if(someInts[i]%2 == 0){
           System.out.println(someInts[i]);
       }
    }
    }
}
