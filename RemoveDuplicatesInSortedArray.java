import java.util.Scanner;

public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicate(int[] nums){
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[count]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
    /*
        Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
        Input: nums = [0, 0, 3, 3, 5, 6]
        Output: 4
        Explanation:
        Resulting array = [0, 3, 5, 6, _, _]
        There are 4 distinct elements in nums and the elements marked as _ can have any value.
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array --> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Array numbers: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=removeDuplicate(arr);
        System.out.println(result);
    }
}
