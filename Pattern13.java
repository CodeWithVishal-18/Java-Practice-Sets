import java.util.Scanner;

public class Pattern13 {
    static void printPattern(int x){
        int count=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
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
