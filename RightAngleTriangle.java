import java.util.Scanner;

public class RightAngleTriangle {
    static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number of times you want to print: ");
        int num=sc.nextInt();

        System.out.println("The pattern Look Like this: ");
        printPattern(num);
    }
}
