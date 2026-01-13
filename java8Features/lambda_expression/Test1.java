package java8Features.lambda_expression;

interface I1{
    void m1(int p);
}

interface I2{
    void m1(int p, float f);
}
public class Test1 {

    public static void main(String[] args) {
        
// parameter type must be same 


        I2 i3 = (int p, float f) -> {};
        I1 i1 = (int p) -> {System.out.println("LE1 p: "+ p);};
       
        //I1 i2 = (long p) -> {System.out.println("LE1 p: "+ p);};
            // Unresolved compilation problem: 
            //Lambda expression's parameter p is expected to be of type int

        i1.m1(5);
    }
    
}
