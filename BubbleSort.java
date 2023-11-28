import java.util.*;
public class BubbleSort {
    public static void Bubble(int[] arr){
        //now sorting
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //swapping done
    }

    public static void printarr(int[] arr){
        System.out.println("");
        System.out.println("the sorted array is: ");
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        //bubble sort
        Scanner sc= new Scanner(System.in);
        System.out.println("The number of elements in an array:");
        int n= sc.nextInt();
        // declare the array
        int[] arr= new int[n]; 
        for(int i=0;i<arr.length;i++){ // the arr.length gives the length of the array
            //now take each value of the array
            System.out.println("Enter the value to be inserted into the array arr at "+i+"th position");
            int b= sc.nextInt();
            arr[i]=b;
        }
        // now printing the array
        System.out.println("the array inputed hereby is: ");
        
        for(int z=0; z<arr.length;z++){
            
            System.out.println(arr[z]);
            
        }
        // now the bubble sort
        Bubble(arr);
        printarr(arr);
        
    }
}
