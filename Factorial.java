import java.util.*;

public class Factorial {
    public static int factorial(int a) {
        if(a<0){
            System.out.println("invalid number");
            return 0;
        }
        
        else if(a==0){
            System.out.println("Factorialof the number 0 is:"+1);
        }
        else{
            int b=1;
            for(int i=1;i<=a;i++){
                b=b*i;
            }
            System.out.println("the factorial of "+ a +" is: "+ b);
        }
         return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        factorial(a);
    }
}
