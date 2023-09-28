import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("tony");
        System.out.println(sb);

        //to print a character at a certain position 1:
        System.out.println(sb.charAt(1));
        //set character at an index 0 with P
        sb.setCharAt(0,'P');
        System.out.println(sb);
        
        //To add a character s at an index 0
        sb.insert(0,'s');
        System.out.println(sb);

        //To delete stuff
        sb.delete(2,3);
        System.out.println(sb);

        //To add characters at the end in the same string.
        sb.append("y");

        //to find length of string
        System.out.println(sb.length());

        //to reverse a string

        for(int i=0;i<sb.length()/2;i++){

            int front=1;
            int back= sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backchar= sb.charAt(back);
            
            sb.setCharAt(i, backchar);
            

        }
        System.out.println(sb);



    }
}
