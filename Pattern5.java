import java.util.Scanner;

public class Pattern5 {
    static void printPattern(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Size of pattern ---> ");
        int size = sc.nextInt();

        System.out.println("Pattern is like this: ");
        printPattern(size);
    }
}
