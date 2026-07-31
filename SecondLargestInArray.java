import java.util.Scanner;

public class SecondLargestInArray {

    public static int secondLargest(int[] nums){
        int max=-1;
        int secondMax=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondMax=max;
                max=nums[i];
            }else if(nums[i]<max && nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        return secondMax;
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
        int result=secondLargest(arr);
        System.out.println("The second Largest Number in this Array is --> "+result);
    }
}
