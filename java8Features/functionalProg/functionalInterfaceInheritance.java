package java8Features.functionalProg;

@FunctionalInterface
public interface functionalInterfaceInheritance {

    public void add(int a, int b);

    
}
@FunctionalInterface
interface sample extends functionalInterfaceInheritance{
    public void sub(int a, int b);
}

// if we are creating a functiona interface by extending the parent interface then if we create one more abstract method in the child interface then it will give compile time error
// because in functional interface only one abstract method is allowed
