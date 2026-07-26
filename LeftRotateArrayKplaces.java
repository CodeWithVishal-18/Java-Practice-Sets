import java.util.Scanner;

public class LeftRotateArrayKplaces {

public static int[] leftRotate(int[] nums,int k){
    while(k>0){
        int first=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=first;
        k--;
    }
    return nums;
}

    public static void main(String[] args) {
        // Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
        // Example 1
        // Input: nums = [1, 2, 3, 4, 5, 6], k = 2
        // Output: nums = [3, 4, 5, 6, 1, 2]
        // Explanation:
        // rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
        // rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array--> ");
        int size=sc.nextInt();
        System.out.println("Enter the number inside array: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("How much time it rotate on left side --> ");
        int rotate=sc.nextInt();
        int[] result=leftRotate(arr,rotate);
        for(int res:result){
            System.out.print(res+" ");
        }

    }
}
