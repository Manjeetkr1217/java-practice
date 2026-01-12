package Exception.customizedException;

public class test {

    public static void main(String[] args) {
        int age = 25;
        if(age <= 18){
            throw new ToYoungException("you are too young to get married");
        }else{
            throw new toOldException("wait for some more time ... you will get some");
        }
    }
    
}
