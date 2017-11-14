import java.util.*;

public class Harry {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = console.nextLine();
		String backwards = backwardsString(input);
		System.out.println(backwards);
		console.close();
	}
	
	public static String backwardsString(String input) {
		int length;
		length = input.length();
		int x = 0;
		char[] backwards = new char[length];
		for (int y=length; y > 0; y--) {
			backwards[x] = input.charAt(y-1);
			x++;
		}
		return new String(backwards);
	}
}