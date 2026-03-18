import java.util.Scanner;

public class Pattern17 {
    static void printPattern(int x){
        for(int i=x;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int m=1;m<=2*x-2*i;m++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int m=1;m<=2*x-2*i;m++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Size of pattern ---> ");
        int size = sc.nextInt();

        System.out.println("Pattern is like this: ");
        printPattern(size);
    }
}
