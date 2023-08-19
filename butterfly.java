import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows in a butterfly (even numbers only)");
        int n= sc.nextInt();
        n=n/2;

        for(int i=1;i<=n;i++){
            //lhs of upper part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int s= 2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //rhs of upper part

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=n;i>=1;i--){
            
            //lhs of lower part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int s= 2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //rhs of lower part

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
