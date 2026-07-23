import java.util.Scanner;

public class SnapStreaks {
    public static String algoToCalculateMaxStreak(int[] a,int[] b){
        String result="";
        int streakA=0;
        int maxStreakA=0;
        for(int num:a){
            if(num>0){
                streakA++;
                maxStreakA=Math.max(maxStreakA, streakA);
            }else{
                streakA=0;
            }
        }
        int streakB=0;
        int maxStreakB=0;
        for(int num:b){
            if(num>0){
                streakB++;
                maxStreakB=Math.max(maxStreakB, streakB);
            }else{
                streakB=0;
            }
        }
        if(maxStreakA>maxStreakB){
            result="Om";
        }else if(maxStreakB>maxStreakA){
            result="Addy";
        }else{
            result="Draw";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of testCases--> ");
        int testCase=sc.nextInt();
        while(testCase-->0){
            System.out.print("Enter the number of days--> ");
            int days=sc.nextInt();

            int[] A=new int[days];
            int[] B=new int[days];

            System.out.println("Enter the "+days+" snap score  for user A : ");
            for(int i=0;i<days;i++){
                A[i]=sc.nextInt();
            }
            System.out.println("Enter the "+days+" snap score  for user B : ");
            for(int i=0;i<days;i++){
                B[i]=sc.nextInt();
            }
            String result=algoToCalculateMaxStreak(A,B);
            System.out.println(result);
        }
    }
}
