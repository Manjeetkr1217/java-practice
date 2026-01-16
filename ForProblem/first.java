package ForProblem;

import java.util.ArrayList;

public class first {

    public static void main(String[] args) {
        
          System.out.println("hi");
        
      ArrayList<Object> al = new ArrayList<>();
      al.add("a");
      al.add(5);
      al.add("b");
      al.add(1);
      al.add("C");

      // first way

      System.out.println(al);


      // second way

     for(Object obj: al){
        System.out.println(obj);
     }

     // third way

     al.forEach(obj -> System.out.println(obj));

     // fourth way

     al.forEach(System.out::println);
    }
    
}
