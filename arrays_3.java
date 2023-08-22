import java.util.*;


public class arrays_3 {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];


        //input
        for(int i=0; i<size; i++) {
            System.out.println("Enter the number:");
            numbers[i] = sc.nextInt();
        }


        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) { 
        if(numbers[i] > numbers[i+1]) { 
                isAscending = false;
            }
        }


        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } 
        else {
            System.out.println("The array is not sorted in ascending order");
        }
   
    }
}
