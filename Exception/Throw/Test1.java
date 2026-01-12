package Exception.Throw;

public class Test1 {

    // case 1
    // -------------
/*     if 'e' refers null then we will get null pointer exception

        Exception in thread "main" java.lang.NullPointerException
        at Exception.Throw.Test1.main(Test1.java:7)
*/
    //static ArithmeticException e ;

    static ArithmeticException e = new ArithmeticException();

/*
    Exception in thread "main" java.lang.ArithmeticException
        at Exception.Throw.Test1.<clinit>(Test1.java:13)
*/
    

    
    public static void main(String[] args) {

        throw e;
        
    }
    
}
