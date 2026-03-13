import java.util.Scanner;

public class StudentGrade {
    static void gradeCheck(int num){
        if(num>100){
            System.out.println("Marks should be less than or equal to 100");
        }
        else if(num>=90&&num<=100){
            System.out.println("Grade A");
        }else if(num<90&&num>=70){
            System.out.println("Grade B");
        }else if(num<70&&num>=55){
            System.out.println("Grade C");
        }else if(num<55&&num>=33){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Student Marks: ");
        int marks=sc.nextInt();

        gradeCheck(marks);
    }
}
