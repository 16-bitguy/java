import java.util.*;
public class insertionSort {
    public static void insert(int[] arr){
        
    }

    public static void show(int[] arr){

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n= sc.nextInt();

        //now declaring the array
        int[] arr= new int[n];
        System.out.println("Now the elements: ");

        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+"th element: ");
            arr[i]= sc.nextInt();
        }

        //now to print the array 
        System.out.println("Now the array: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        //now sorting the array
        insert(arr);
        //now printing the array which is sorted
        show(arr);


    }
}
