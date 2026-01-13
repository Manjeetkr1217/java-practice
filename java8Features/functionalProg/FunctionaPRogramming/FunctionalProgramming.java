package java8Features.functionalProg.FunctionaPRogramming;

interface AO{
    void calculate(int a, int b);
}

class Calc{
    static void calculate(AO ao){
        ao.calculate(10,20);
    }
}

public class FunctionalProgramming {

    public static void main(String[] args) {
        
        Calc.calculate( (int a, int b) -> {System.out.println(a+b);}  );
        Calc.calculate( (int a, int b) -> {System.out.println(a-b);}  );
        Calc.calculate( (int a, int b) -> {System.out.println(a*b);}  );
        Calc.calculate( (int a, int b) -> {System.out.println(a/b);}  );
    }
    
}
