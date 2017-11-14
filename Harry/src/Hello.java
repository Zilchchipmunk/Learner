import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Hello {
	public static void main(String args[]) throws IOException{
		try {
			PrintWriter out = new PrintWriter("hello.txt");
			out.println("Hello World!");
			out.close();
			FileReader hello= new FileReader("hello.txt");
			String file = "";
			int i;
			while((i = hello.read())!=-1){
				   char ch = (char)i;
				 file = file + ch; 
				  }
				   System.out.println(file);
				   hello.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		}
			
	}
			

}
