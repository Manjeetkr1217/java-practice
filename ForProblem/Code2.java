package ForProblem;

import java.util.LinkedHashSet;

public class Code2 {

    public static void main(String[] args) {
        
        LinkedHashSet<Object> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add(5);
        lhs.add("b");
        lhs.add(6);
        lhs.add("c");
        lhs.add(7);
        System.out.println(lhs);

        lhs.forEach(obj -> {
            if(obj instanceof String s){
                System.out.println(s.toUpperCase());
            }else{
                System.out.println(obj);
            }
        });
    }
    
}
