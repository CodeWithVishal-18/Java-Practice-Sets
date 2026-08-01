import java.util.Scanner;

public class ReverseArrayInRecursion {

    public static int[] reverseArray(int[] nums){
        int left=0;
        int right=nums.length-1;
        reverse(nums,left,right);
        return nums;
    }
    public static void reverse(int[] nums,int left, int right){
        if(left>=right){
            return;
        }
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
        reverse(nums, left, right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array --> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Array numbers: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=reverseArray(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
