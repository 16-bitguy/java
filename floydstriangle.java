import java.util.*;
public class floydstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no:of rows please");
        int n= sc.nextInt();
        int a=1;
        for(int i=0;i<=n;i++){ //no of rows
            for(int j=1;j<=i;j++){ // numbers to be printed
                System.out.print(a);
                a++;
            }
            System.out.println("");
        }
    }
}
