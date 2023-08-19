import java.util.Scanner;

public class avgOfThreeNumbers {
    public static void average(int a,int b, int c){
        System.out.println("The average of three numbers is: "+(a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        average(a,b,c);
    }
}
