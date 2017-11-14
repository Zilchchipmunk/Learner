import java.util.*; 

public class Project {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please input a six charater code");
		String input = console.nextLine();
		for (int i=0; i < input.length(); i++) {
			encrypt (input.charAt(i));
			System.out.print(" ");
		}
		console.close();
	}
	public static void encrypt(char c) {
		if (c >= '0' && c <= '9') {
			if (c % 2 == 1) {
				System.out.print(c);
			}else {
				System.out.print(c + 2);
			}
		}else {
			System.out.print((char)(c + 4));
		}
	}		
				

}
