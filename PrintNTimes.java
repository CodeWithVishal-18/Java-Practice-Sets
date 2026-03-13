import java.util.Scanner;

public class PrintNTimes {
    static void printx(int num,int num2){
        for(int i=1;i<=num2;i++){
            if(num2==0){
                System.out.print("");
            }else if(i==num2){
                System.out.print(num);
            }else{
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number which you want to print: ");
        int num=sc.nextInt();

        System.out.print("Enter the no. of times you want to print: ");
        int no_of_times=sc.nextInt();

        printx(num, no_of_times);
    }
}
