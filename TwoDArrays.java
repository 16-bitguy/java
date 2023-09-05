import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int a= sc.nextInt();
        System.out.println("Enter the number of columns");
        int b= sc.nextInt();

        int [][] array= new int[a][b]; //now input

        for(int i=0;i<a;i++){ //rows
            for(int j=0;j<b;j++){
                System.out.println("Enter the value to be inserted:");
                array [i][j]= sc.nextInt();
                
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
