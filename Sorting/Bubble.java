//  import java.util.Arrays;
//  import java.util.Collections;
 import java.util.*;
public class Bubble {
    public static void bubble(int arr[]){
        // int n=arr.length;
       boolean swapped;
        for(int turn=0;turn<arr.length-1;turn++){
            swapped=false;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped!=true){
                break;
                }  
            }
    }
    
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
   
    

    public static void InsertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
           int curr=arr[i];
           int prev=i-1;
        //    finding out correct position for insertion
           while(prev>=0&&arr[prev]<curr){
            arr[prev+1]=arr[prev];
            prev--;
           }
        //    insertion
           arr[prev+1]=curr;
        }
    }
    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);

        }
        int count[]=new int[largest+1];
          for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
    }
}
    
    public static void main(String args[]){
        Integer arr[]={6,7,4,3};
        // bubble(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        // printarray(arr);
        // Arrays.sort(arr,0,2);
     
        // for(int i=0;i<arr.length;i++){
        //     count[arr[i]]++;
        //     // System.out.print(arr[i] +" ");
        // }
        // System.out.println();
        
    }
}
