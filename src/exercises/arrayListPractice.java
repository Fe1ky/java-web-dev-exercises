package exercises;
import java.util.ArrayList;


public class arrayListPractice {



    public static void main(String[] args){
        int[] someInts = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> ints = new ArrayList<>();

        for(int i=0; i<someInts.length;i++){
            ints.add(someInts[i]);
        }
        System.out.println(sumEven(ints));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

}



//    public static void main(String[] args){
//        Double[] someInts = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
//        ArrayList<Double> ints = new ArrayList<>();
//        double sum = 0.0;
//        for(int i=0; i<someInts.length;i++){
//            if(someInts[i]%2==0){
//            ints.add(someInts[i]);
//            }
//        }
//        System.out.println(ints);
//    for(int i=0; i<ints.size();i++){
//        sum += ints.get(i);
//    }
//        System.out.println(sum);
//
//    }


