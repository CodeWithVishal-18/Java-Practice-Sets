import java.util.Scanner;

public class RecursionRotateArrayKPlaces {

    public static void rotateArray(int[] nums,int k){
        int size=nums.length;
        k=k%size;
        rotate(nums,0,k-1);
        rotate(nums,k,size-1);
        rotate(nums,0,size-1);
    }
    public static void rotate(int[] nums, int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
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
        System.out.print("How much place do you want to shuffle --> ");
        int k=sc.nextInt();
        rotateArray(arr,k);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
