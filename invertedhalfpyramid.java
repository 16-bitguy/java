import java.util.*;
public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows");
        int b= sc.nextInt();

        for(int i=1;i<=b;i++){
            for(int j=i;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
