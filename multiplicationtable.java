import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            for(int i=0;i<=10;i++){
                System.out.printf("%d * %d = %d \n", n, i, n* i);
            }
        }
    }
}
