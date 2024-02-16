import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new URL("https://driveone1203.github.io/HamiltonianCycle").openStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        s.close();
    }
}