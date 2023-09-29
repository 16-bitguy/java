import java.util.*;
public class getBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("enter the position of the bit needed:");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        
        //binary of num
        System.out.println(Integer.toBinaryString(n)); 

        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }

        else{
            System.out.println("bit was one");
        }

    }
}
