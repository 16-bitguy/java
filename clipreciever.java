import java.util.*;
import java.net.*;
class clipreciever{
	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(new URL("https://cl1p.net/vp5").openStream());
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
	}
}