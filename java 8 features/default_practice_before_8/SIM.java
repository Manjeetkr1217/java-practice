interface SIM{
    public abstract void call();
    public abstract void sms();


    // after java 8 we can create default method in interface
    // public default void data(){
    //     System.out.println("Default Data method in SIM interface");
    //  }
}