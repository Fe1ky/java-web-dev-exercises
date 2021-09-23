package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator(); // flavors to sort
        Comparator comparator1 = new ConeComparator();

        for (Flavor object: flavors) {
            System.out.println(object.getName());
        }
        System.out.println(" ");



        flavors.sort(comparator); // sorts flavors

        for (Flavor object: flavors) {
            System.out.println(object.getName());
        }
        System.out.println(" ");
        for (Cone object: cones) {
            System.out.println(object.getCost());
        }


        cones.sort(comparator1);

        System.out.println(" ");
        for (Cone object: cones) {
            System.out.println(object.getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
