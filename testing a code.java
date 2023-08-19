import java.net.URL;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new URL("https://driveone1203.github.io").openStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    s.close();
    }
}

