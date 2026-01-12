package Exception.Throw;

public class Case2 {

    /*
        After throw we are not allowed to write any statement 
        otherwise we will get comiple time error

    */
    public static void main(String[] args) {
        
        System.out.println(10/0);
      // throw new ArithmeticException("/ by zero");
        System.out.println("Hello");
    }
    
}
