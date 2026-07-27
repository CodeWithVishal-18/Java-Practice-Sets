import java.util.Scanner;

public class MoveZeroesToEnd {

    public static int[] moveZeroes(int[] nums){
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pointer]=nums[i];
                pointer++;
            }
        }
        while(pointer<nums.length){
            nums[pointer]=0;
            pointer++;
        }
        return nums;
    }

    public static void main(String[] args) {
        /*
            Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
            This must be done in place, without making a copy of the array.
            Example 1
            Input: nums = [0, 1, 4, 0, 5, 2]
            Output: [1, 4, 5, 2, 0, 0]
            Explanation:
            Both the zeroes are moved to the end and the order of the other elements stay the same
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array --> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Array numbers: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int[] result=moveZeroes(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
