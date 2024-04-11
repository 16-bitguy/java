import java.util.*;
//declaration:  type[][] arrayname= new type[rows no][columns no]

public class array_2D {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns in the array [Seperated by space]: ");
        
        String a = Sc.nextLine();
        String[] b = a.split(" ");
        //int length= b.length;
        String length= b[0];
        String bread= b[1];
        System.out.println("length = "+length);
        System.out.println("breadth = "+bread);

        
        int len = Integer.parseInt(length);
        int breadth = Integer.parseInt(bread);

        int[][] Array= new int[len][breadth];

        //taking input in 2D array

        for(int i=0;i<len;i++){
            for(int j=0;j<breadth;j++){
                //this way or the other way
                //System.out.print(num1 + " ");
                //System.out.println(num2);

                System.out.println("Enter the value for the following row and column: ");
                System.out.print("row: "+i+" column: "+j+" - ");
                Array[i][j]= Sc.nextInt();
                
            }
        }

        //now to print it in a matrix format

        for(int i=0;i<len;i++){
            for(int j=0;j<breadth;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

        


        

    }
}
