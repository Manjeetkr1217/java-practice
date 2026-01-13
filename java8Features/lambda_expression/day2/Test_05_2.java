package java8Features.lambda_expression.day2;

interface I1{
    void m1();
}

interface I2{
    void m1(int x);
}

interface I3{
    void m1(int x,String s);
}

interface I4{
    void m1();
}

interface I5{
    int m1();
}

public class Test_05_2 {

    public static void main(String[] args) {
     
        I1 i1 = () -> {System.out.println("LE1");};       i1.m1();

        I2 i2 = (int x) -> {System.out.println("LE2");};  i2.m1(5);
        I2 i3 = (x) -> {System.out.println("LE2");};      i3.m1(9);
        I2 i4 = x -> {System.out.println("LE2");};        i4.m1(8);
        I2 i5 = a -> {System.out.println("LE2 X"+ a );};     i5.m1(5); 
        I2 i6 = a -> System.out.println("LE2 X"+ a );        i6.m1(5);
        
        I3 i7 = (int x,String s) -> System.out.printf("LE7 x: %d  y: %s", x,s);
        i7.m1(5, "KH");

        I3 i8 = (x,s) -> System.out.printf("LE7 x: %d  y: %s", x,s);
        i8.m1(10, "SK");

       // I3 i9 = x,y -> System.out.printf("LE7 x: %d  y: %s", x,s);

       System.out.println();
       // ---------------------------
       I4 i10 = () -> System.out.println("LE10");
       i10.m1();
       
       // I4 i11 = () -> ;
       
       I4 i12 = () -> {return;};            i12.m1();
       //I4 i13 = () -> return;        // CE : illegal start of expression

       System.out.println();
       //--------------------------
       //I5 i14 = () -> {};             // CE : bad return type in lambda expression
       //I5 i15 = () -> {return; };     // CE : bad return type in lambda expression
       
       I5 i16 = () -> {System.out.println("LE with rt"); return 5;};   
      i16.m1();
      int x = i16.m1();
      System.out.println(i16.m1());

    System.out.println();
    //--------------------

    I5 i17 = () -> {return 8; }; 
    System.out.println(i17.m1());

    // I5 i18 = () -> return 8; 

    // return statemnt without return keyword and {}
    // with body must use return keyword
    // without body never use return statement

    I5 i19 = () ->  17;  System.out.println(i19.m1());
    //I5 i20 = ()->{20};



 
    }
    
}
