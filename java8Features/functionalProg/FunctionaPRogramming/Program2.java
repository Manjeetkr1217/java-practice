package java8Features.functionalProg.FunctionaPRogramming;
@FunctionalInterface
interface StringOperation{
    void stringop(String s);
}

public class Program2 {

    StringOperation sLength = (String s) -> {
            System.out.println("Length of String : " + s.length());
    };


    sLength.stringop("Hello");
    
}
