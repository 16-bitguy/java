import java.util.*;

public class arrays {
    //syntax: type[] array name= new type[size]
    public static void main(String[] args) {
        int[] marks= new int[3];
        marks[0]=97;
        marks[1]=90;
        marks[2]=85;
        // or int[] marks={97,90,85}
        //default initialization in java is null values.
        // size of array can be found out using array.length 
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
