package Exception.Throw;

public class Case3 extends RuntimeException{


    /*
        Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        No exception of type Case3 can be thrown; an exception type must be a subclass of Throwable

        at Exception.Throw.Case3.main(Case3.java:11)

        -----------------------

        // when we extends RuntimeException 
        Exception in thread "main" Exception.Throw.Case3
        at Exception.Throw.Case3.main(Case3.java:7)
    */
    public static void main(String[] args) {
        
        throw new Case3();
    }
    
}
