//to set the bit in any position as one.
import java.util.*;
public class setbit {
    public static void main(String[] args){
      int n = 5; //0101
      int pos = 1;
      int bitMask = 1<<pos;

      int newNumber = bitMask | n;
      System.out.println(newNumber);

        //binary of num
        System.out.println(Integer.toBinaryString(n));
        
        System.out.println(Integer.toBinaryString(newNumber));
    }   

}
