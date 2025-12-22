package java8Features.functionalProg;

@FunctionalInterface
interface generic<T> {

    T add(T a, T b);
    
}

// a generic functional interface is a interface we create using generics
// earlier when we dont use generic concept then we have to create separate interface for each type of operation
// here we have created a generic functional interface
// the allowed value of T is any type that implements the add method
// example of allowed value is Integer, Double, String etc. 

