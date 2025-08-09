package com.shadhini.tryouts.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        // Java Arrays of fixed size -----------------------------------------------------------------------------------
        // =============================================================================================================
        System.out.println("Java Arrays -----------------------------------------------------------------------------");
        int[] numbers = new int[3];

        System.out.println(numbers); // memory location of the numbers object
        // Output: [I@c818063

        System.out.println(Arrays.toString(numbers)); // prints the array
        // Output: [0, 0, 0]

        // add elements to array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3]

        // initialize array with values
        int[] numbers2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers2)); // Output: [10, 20, 30, 40, 50]

        // size of array
        System.out.println(numbers2.length); // Output: 5

        // Java Dynamic Arrays -----------------------------------------------------------------------------------------
        // =============================================================================================================
        System.out.println("Java Dynamic Arrays: ArrayList ----------------------------------------------------------");
        // create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // Output: [10, 20, 30]

        // remove items by index
        list.remove(1);
        System.out.println(list); // Output: [10, 30]

        // remove an object
        list.remove(new Integer(10));
        System.out.println(list); // Output:[30]

        // get index of an object (first occurrence of the object)
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(50);
        System.out.println(list); // Output: [30, 40, 50, 60, 70]
        System.out.println(list.indexOf(50)); // Output: 2

        // get index of last occurrence of an object
        System.out.println(list.lastIndexOf(50)); // Output: 4

        // check whether the array has a specific object or not
        System.out.println(list.contains(60)); // Output: true

        // get number of items in the array
        System.out.println(list.size()); // Output: 5

        // convert ArrayList to a regular array
        System.out.println(list.toArray()); // Output: [Ljava.lang.Object;@3f0ee7cb

    }
}
