import java.util.*;
public class array_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        int[] numbers= new int[n] ;
        for(int i=0;i<n;i++){
        System.out.println("enter the number");
        numbers[i]=sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
     
        for(int j=0; j<numbers.length; j++) {
            if(numbers[j] < min) {
                min = numbers[j];
            }
            if(numbers[j] > max) {
                max = numbers[j];
            }
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);

        
    }
    

}
