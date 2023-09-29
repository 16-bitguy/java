import java.util.*;
public class clearbit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("Enter the position of the number:");
        int pos= sc.nextInt();

        //binary of num
        System.out.println(Integer.toBinaryString(n));

        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);

        System.out.println(Integer.toBinaryString(newNumber));
    }

}
