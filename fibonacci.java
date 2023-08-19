import java.util.*;

public class Fibona {
    public static void num(int n) {
        int s = 1;
        int i = 1;
        System.out.print(s);
        for (int k = n - 3; k > 0; k--) {
            int c = s + i;
            i = s;
            s = c;
            System.out.print(" " + s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        System.out.print(i);
        if (n == 1) {
            System.out.print(j);
        } else {
            num(n);
        }
    }
}
