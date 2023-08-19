import java.util.*;
public class greatesCommonDivisor {
    public static int gcd(int a,int b) {
        int i;

        if(a>b){
             i=b;
        }
        else{
             i=a;
        }

        for(int j=i ;j>1;j--){
            if(a/j==0 || b%j==0){
                return j;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= gcd(a,b);

        System.out.println("The greates common divisor is "+ c);
    }
}
