import java.util.Scanner;

public class Pattern19 {
    static void printPattern(int x){
        for(int i=1;i<=x;i++){
            if(i==1||i==x){
                for(int j=1;j<=x;j++){
                    System.out.print("*"+" ");
                }
            }else{
                for(int j=1;j<=x;j++){
                    if(j==1||j==x){
                        System.out.print("*"+" ");
                    }else{
                        System.out.print(" "+" ");
                    }
                }
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
