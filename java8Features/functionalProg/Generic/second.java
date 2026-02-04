@FunctionalInterface
interface calculation<T>{
    void calc(T t1, T t2);
}

@FunctionalInterface
interface calculation1<T>{
    T calc(T t1, T t2);
}

public class second {

    public static void main(String[] args) {

        //=========== Calculation ==============
        calculation<Integer> c1 = (a,b) ->  {System.out.println(a+b);};
        c1.calc(5, 9);

        calculation<Float> c2 = (a,b) -> {System.out.println(a+b);};
        c2.calc(5.6f, 5.2f);

        
      //=============== Calcuation1 =====================

      calculation1<Integer> c3 = (a,b) -> { return a+b;};

      int res =c3.calc(5, 15);
      System.out.println(res);



    }
    
}
