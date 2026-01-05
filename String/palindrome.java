package String;

public class palindrome {
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";
        boolean result = checkPalindrome(s);
        System.out.println(result);
    }

    public static  boolean checkPalindrome(String s){

        String str = s.replaceAll("[^a-zA-Z]","").toLowerCase();

        System.out.println(str);
        
        int left = 0;
        int right = str.length() -1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;

    }
    
}
