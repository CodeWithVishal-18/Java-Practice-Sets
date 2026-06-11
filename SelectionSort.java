import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of Array --> ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the "+size+" Numbers:-");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int[] result=selectionSort(arr);

        System.out.println("After Using Selection Sort, Sorted Array will be: ");
        for(int num=0;num<result.length;num++){
            System.out.print(result[num]+" ");
        }
    }
}
