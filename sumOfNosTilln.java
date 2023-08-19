import java.util.*;

public class sumOfNosTilln {
    
    public static void sum(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            c=c+i;
        }
        System.out.println("The sum of numbers till "+n+" is: "+c);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sum(n);
    }
}
