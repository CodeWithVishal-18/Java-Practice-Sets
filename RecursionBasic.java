import java.util.Scanner;

public class RecursionBasic {
    // print number from 1 to n
    static void printNumber(int n){
        if(n==0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
    static void printNumberNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumberNto1(n-1);
    }
    static int sumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNumbers(n-1); 
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number upto you want print --> ");
        int num=sc.nextInt();
        System.out.println("Print Number From 1 to "+num);
        printNumber(num);
        System.out.println("Print NUmber from "+num+" to 1");
        printNumberNto1(num);
        System.out.print("Print Sum of "+num+" number --> ");
        int sum=sumOfNumbers(num);
        System.out.print(sum);
        System.out.println();
        System.out.print("Print Factorial of "+5+" is --> ");
        int factorial=factorial(num);
        System.out.print(factorial);
    }
}
