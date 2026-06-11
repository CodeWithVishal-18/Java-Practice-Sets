import java.util.Scanner;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Array ---> ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the "+size+" Number :- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("The Sorted Array, by using Bubble Sort:- ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
