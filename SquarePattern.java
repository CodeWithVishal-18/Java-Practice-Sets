import java.util.Scanner;

public class SquarePattern {
    static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("ENter the Number: ");
        int num=sc.nextInt();

        System.out.println("The Square Star Pattern Looks Like this: ");
        printPattern(num);
    }
}
