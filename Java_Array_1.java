import java.util.*;

// defining an array: type[] array name= new type[size]
//default initialization in array in java is 0 for int, 0.0 for float,"" for string and False for boolean
public class Java_Array_1 {
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int size= Sc.nextInt();
        int[] marks= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the mark:");
            marks[i]=Sc.nextInt();
        }

        //System.out.println(marks);
        //this prints a jargon value
        //to get the values i the array:

        int len= marks.length;
        for (int i=0;i<len;i++){
            System.out.println("The value at position " + i + " is: "+marks[i]);
        }

    }
}
