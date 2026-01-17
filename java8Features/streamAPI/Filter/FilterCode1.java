package java8Features.streamAPI.Filter;

import java.util.ArrayList;
import java.util.List;

// create collection of elements with Strings and Integers
// Retrieve only String objects and print by uisng Stream API

public class FilterCode1 {

    public static void main(String[] args) {

        List<Object> al = List.of("a",5,"b",6,"c",8);

        /* 

        // =========1. printing list elements =======================
        System.out.print(al);

         System.out.println();
        
        // ==========2. printing using stream ========================

        al.stream()
            .forEach(obj -> System.out.print(obj + " "));

        System.out.println();
        
        // ===========3. filtering and printing string ===============

        al.stream()
            .filter(obj -> obj instanceof String)
            .forEach(obj -> System.out.print(obj + " "));

        System.out.println();

        // ===========4. filtering and printing integer ===============

        al.stream()
            .filter(obj -> obj instanceof Integer)
            .forEach(obj -> System.out.print(obj + " "));

            System.out.println();

        // ==========5. filtering and printing even elements ==========

        al.stream()
            .filter(obj -> obj instanceof Integer)
            .filter(ele -> ((Integer)ele) %2 ==0 )
            .forEach(ele -> System.out.print(ele +" ")); 

            System.out.println();

        // ==========5. filtering and printing even elements ==========

        al.stream()
            .filter(obj -> obj instanceof Integer)
            .filter(ele -> ((Integer)ele) %2 !=0)
            .forEach(ele -> System.out.println(ele));

        System.out.println();

        */

        // =====================================================

        // map

        List<Object> al1 = List.of("a",5,"b",6,"c",8);

        al1.stream()
            .map(ele -> ele.toString()+5)
            .forEach(System.out::println);

        System.out.println();

           al1.stream()
            .map(ele -> ele.toString()+5)
            .forEach(ele -> System.out.print(ele.toUpperCase() + " "));

        System.out.println();

        // ==========retrieve only string and print them in upper case

        al1.stream()
            .filter(obj -> obj instanceof String)
            .map(obj -> obj.toString().toUpperCase())
            .forEach(System.out::println);

        
            System.out.println();
    // ======== retrieve only integer

    al1.stream()
        .filter(obj -> obj instanceof Integer)
        .map(ele -> (int)ele)
        .forEach(ele ->  System.out.print((ele+5) + " "));

    System.out.println();

    



        
    }
    
}
