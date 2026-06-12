import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            // if we want to put smaller element to right,like in DESCENDING ORDER then we just use ( arr[j]<current )
            while(j>=0 && arr[j]>current){  // this is for ascending order we move big element to right
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array --> ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the "+size+" elements :- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is :- ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("After Insertion Sort, Sorted Array becomes : ");
        for(int result=0;result<size;result++){
            System.out.print(arr[result]+" ");
        }
    }
}
