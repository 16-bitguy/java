import java.util.*;
//here we put the smallest elemnt up first
//and we sort as it once per iteration
// sorta like bubble sort but we find the smallest elemnt first and then we shift it to front.
//time complexity= O(n**2)
public class selectionSort {
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]> arr[j]){
                    smallest=j;

                }
            }
            int temp= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
    }

    public static void show(int[] arr){
        System.out.println("");
        System.out.println("Now the sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        //now creating the array and inputing the array
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        //get each elements
        System.out.println("Enter each elements:");
        System.out.println("");
        int[] arr= new int[n];
        //now looping
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+"th element: ");
            arr[i]=sc.nextInt();
        }

        //the inputed array is:
        System.out.println("Now the array entered:");
        for(int z=0;z<arr.length;z++){
            System.out.println(arr[z]);
        }


        selection(arr);
        show(arr);
    }
}
