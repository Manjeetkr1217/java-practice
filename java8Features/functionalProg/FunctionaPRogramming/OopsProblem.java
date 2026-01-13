package java8Features.functionalProg.FunctionaPRogramming;

interface AO{
    void calculate(int a, int b);
}

class Addition implements AO{
    public void calculate(int a, int b){
        int c = a+b;
        System.out.printf("Addition of %d and %d is %d ", a,b,c);
        System.out.println();
    }
} 

class Substraction implements AO{
    public void calculate(int a, int b){
        int c = a-b;
        System.out.printf("Substraction of %d and %d is %d ", a,b,c);
        System.out.println();
    }
} 

class Multiplication implements AO{
    public void calculate(int a, int b){
        int c = a*b;
        System.out.printf("Multiplication of %d and %d is %d ", a,b,c);
        System.out.println();
    }
} 

class Division implements AO{
    public void calculate(int a, int b){
        int c = a/b;
        System.out.printf("Division of %d and %d is %d ", a,b,c);
        System.out.println();
    }
}



class Calc{
    static void calculate(AO ao){
        ao.calculate(10,20);
    }
}

public class OopsProblem {

    public static void main(String[] args) {
        Calc.calculate(new Addition());
        Calc.calculate(new Substraction());
        Calc.calculate(new Multiplication());
        Calc.calculate(new Division());

        Addition add = new Addition();

        Calc.calculate(add);

    }

    
}
