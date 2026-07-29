import java.util.Scanner;

public class RecursionStringPalindrome {

    public static boolean checkPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return checkPalindrome(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to check --> ");
        String str=sc.nextLine();
        boolean result=checkPalindrome(str);
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
