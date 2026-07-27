import java.util.Scanner;

public class MoveZeroesToStart {
    public static int[] moveZeroesStart(int[] nums){
        int pointer=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                nums[pointer]=nums[i];
                pointer--;
            }
        }
        while(pointer>=0){
            nums[pointer]=0;
            pointer--;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array --> ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Array numbers: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int[] result=moveZeroesStart(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
