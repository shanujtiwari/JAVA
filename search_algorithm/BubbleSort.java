//import java.util.*;
public class BubbleSort {

    public static void bubblesort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Use print instead of println
        }
        System.out.println();  // Move this line outside the loop
    }
 
    public static void selectionsort(int arr[]){
    for(int turn=0;turn<arr.length-1;turn++){
        int minP=turn;
        for(int j=turn+1;j<arr.length;j++){
            if(arr[minP]>arr[j]){
                minP=j;
            }
        }
        int temp=arr[minP];
        arr[minP]=arr[turn];
        arr[turn]=temp;


    }
}


     public static void main(String args[]) {
    int arr[] = {1,2,3,4,5};
    selectionsort(arr);
    printArr(arr);
}
}




 