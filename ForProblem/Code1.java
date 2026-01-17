package ForProblem;

import java.util.ArrayList;

// wap to retrieve objects from LHS by using forEach() method 
// print String in upper case
public class Code1 {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("hello ");
        str.add("welcome ");
        str.add("to ");
        str.add("java");

        // first
        System.out.println(str);
        System.out.println();

        //second
        for (String string : str) {
            System.out.println(string.toUpperCase());
            
        }
        System.out.println();
        // third
        str.forEach( obj->  System.out.println(obj.toUpperCase()) );

        System.out.println();

        // fourth

        str.forEach( System.out::println );




        
    }
    
}
