import java.util.*;
//when u need to input a whole newline use sc.nextLine(); instead of sc.next();
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first word:");
        String  firstName= sc.next();
        System.out.println("Enter last word:");
        String  lastName= sc.next();

        String FullName= firstName+'@'+lastName;
        System.out.println(FullName);
        System.out.println("The length of string is "+FullName.length());

        for(int i=0;i<FullName.length();i++){
            //charAt() gives the character at that index
            System.out.println(FullName.charAt(i));

        }

        //To compare two strings we use compareTo(); not == as it fails in a lot of cases.
        //s1>s2 : +ve value
        //s1==2 : 0 value
        //s1<s2 : -ve value

        if(firstName.compareTo(lastName)==0){
            System.out.println("The strings are equal.");
        }
        else{
            System.out.println("The strings aren't equal.");
        }

        //Substring();
        //It gives out characters between two indexes.

        String sentence="Everybody saying L A Knight. Yeah.";
        //syntax= substring(beg index,end index);
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);


    }
}
