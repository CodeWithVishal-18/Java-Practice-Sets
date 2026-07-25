import java.util.Scanner;

public class FindMissingNumber {

    public static int missingNumber(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int length=nums.length;
        int sumFormula=(length*(length+1))/2;
        
        return sumFormula-sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Given an integer array of size n containing distinct values in the range from
         * 0 to n (inclusive), return the only number missing from the array within this range.
         * Example:-
         * Input: nums = [0, 2, 3, 1, 4]
         * Output: 5
         * Explanation:
         * nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
         */

        System.out.print("Enter size of number--> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Your array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int result=missingNumber(arr);
        System.out.println("Output --> "+result);
    }
}
