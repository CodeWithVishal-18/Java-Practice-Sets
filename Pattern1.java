import java.util.Scanner;

public class Pattern1 {
    static void printPattern(int num){
        for(int i=0;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Size of pattern ---> ");
        int size=sc.nextInt();

        System.out.println("Pattern is like this: ");
        printPattern(size);
    }
}
