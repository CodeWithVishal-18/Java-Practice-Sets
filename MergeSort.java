import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int[] nums){
        int low=0;
        int high=nums.length-1;
        if(nums.length<=1 || nums==null) return nums;
        divideArray(nums,low,high);
        return nums;
    }
    public static void divideArray(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        divideArray(nums, low, mid);
        divideArray(nums, mid+1, high);
        merge(nums,low,mid,high);
    }
    public static void merge(int[] nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> list=new ArrayList<>();
        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                list.add(nums[left]);
                left++;
            }else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array --> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int[] result=mergeSort(arr);
        for(int res:result){
            System.out.print(res+" ");
        }

    }
}
