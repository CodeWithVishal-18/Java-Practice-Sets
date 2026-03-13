import java.util.Scanner;

public class IfElseAdultTeenProblem {
    static void result(int num){
        if(num>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Teen");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The User Age: ");
        int age=sc.nextInt();

        result(age);
    }
}