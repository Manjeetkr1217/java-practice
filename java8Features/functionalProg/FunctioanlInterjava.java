package java8Features.functionalProg;

@FunctionalInterface
public interface FunctioanlInterjava {

    public void add(int a, int b);
    // public void add(int a,int b,int c); 
    // we can not create 2nd abstract method in functional interface

    public static final int a = 10;
    public static final int b = 20;
    // we can add as many variable we want in a functioal interface

    public static class A { };
    public static class B { };
    // we can add as many static nested inner classes as we want in a functional interface
    
    public default void m1(){}
    public default void m2(){}
    // we can add as many default methods as we want in a functional interface 
    // this concept is allowed after java 8

    public static void m3(){}
    public static void m4(){}
    // we can add as many static methods as we want in a functional interface
    // this concept is allowed after java 8


    // in java 9 we get private method in functional interface
    private static void m5(){} // this is allowed in java 9
    private void m6(){} // this is allowed in java 9


    public abstract int hashCode();
    public abstract boolean equals(Object obj);
    // we can create java.lang.Object class methods as abstract methods in functional interface

    
    // public default String toString() {
    //     return "This is toString default method";
    // }
   // we cannot override java.lang.Object class methods as default methods in functional interface


    // summary
    // functional interface can have only one abstract method
    // it can have any number of public static final variables
    // it can have any number of static and default methods
    // it can have any number of static nested inner classes
    // it can have multiple static implemented methods
    // it can have any number of private static and private non-static methods (java 9 onwards)
    // it can have java.lang.Object class methods as abstract methods
    // it cannot have java.lang.Object class methods as default methods


    // even in a normal interface all the above rules are applicable
    // excpet one normal interface can have any number of abstract methods
}