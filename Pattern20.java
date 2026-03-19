import java.util.Scanner;

public class Pattern20 {
    static void printPattern(int x){
        int size=2*x-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((x - min) + " ");
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
