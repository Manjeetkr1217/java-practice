package java8Features.functionalProg.FunctionaPRogramming;

@FunctionalInterface
interface StringOperation{
    void stringOperation(String s);
}

public class Program {

    public static void main(String[] args) {
        StringOperation sLength = (String s) -> {
            System.out.println("Length of String is : " +s.length()); 
        };

        StringOperation sUpperCase = (String s) -> {
            System.out.println("String is upper case : "+ s.toUpperCase());
        };

        StringOperation sLowerCase = (String s) -> {
            System.out.println("String is lower case : "+ s.toLowerCase());
        };

        
        sLength.stringOperation("Hello");
        sUpperCase.stringOperation("hello");
        sLowerCase.stringOperation("HELLO");
        

    }
    
}
