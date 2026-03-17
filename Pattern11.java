import java.util.Scanner;

public class Pattern11 {
    static void printPattern(int num){
        for(int i=1;i<=num;i++){
            int start=1;
            if(i%2==0){
                start=0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
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
