package Exception.basic;

public class test1 {
    public static void main(String[] args) {
        
        System.out.println("Hello");
        foo();
    }
    public static void foo(){
        bar();
        System.out.println("Hi");
    }
    public static void bar(){
        System.out.println("bar");
        //System.out.println(10/0);
        Thread.sleep(5000);
    }
    
}
