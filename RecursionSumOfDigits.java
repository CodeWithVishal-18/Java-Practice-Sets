import java.util.Scanner;

public class RecursionSumOfDigits {
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number --> ");
        int num=sc.nextInt();
        int result=sumOfDigits(num);
        System.out.println("Sum of Digits of this "+num+" is "+result);
    }
}
