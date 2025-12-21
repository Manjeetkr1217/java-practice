interface SIM{
    public abstract void call();
    public abstract void sms();

    public default void data(){
        System.out.println("Default Data method in SIM interface");
    }
}