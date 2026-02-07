//package java8Features.streamAPI.Filter;

import java.util.List;

public class practice {

    public static void main(String[] args) {
       
     /* 

        List<Object> al = List.of("a",5,"b",6,"c",8);

        // printing list element 

        System.out.println(al);

        // printing element using stream

        al.stream()
            .forEach(ele -> {System.out.print(ele + ", ");} );

        // printing only string 

        System.out.println();
        al.stream()
            .filter(ele -> ele instanceof String)
            .forEach(ele -> {System.out.print(ele + ", ");} );

        // printing only integer

        System.out.println();

        al.stream()
            .filter(ele -> ele instanceof Integer)
            .forEach(ele -> {System.out.print(ele + ", ");});

        // printing enen 

        System.out.println();

        al.stream()
            .filter(ele -> ele instanceof Integer)
            .filter(ele -> ((Integer)ele) % 2 == 0)
            .forEach(ele -> System.out.print(ele + ", "));


    */


        // ======================= map ===================

        List<Object> al1 = List.of("a",5,"b",6,"c",8);

        al1.stream()
            .map(ele -> ele.toString()+5)
            .forEach(ele -> {System.out.print(ele +", ");}  );
       
            System.out.println();

            // retrieve string and print in upper case

        al1.stream()
            .filter(ele -> ele instanceof String)
            .map(ele -> ele.toString())
            .forEach(ele -> {System.out.print(ele.toUpperCase() +", ");});


        // retrieve integers and add 10 to each 

        System.out.println();
        al1.stream()
            .filter(ele -> ele instanceof Integer)
            .map(ele -> ((Integer)ele) +5) 
            .forEach(ele -> {System.out.print(ele + ", ");} );       
    }
    
}
