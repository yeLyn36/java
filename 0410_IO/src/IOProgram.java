import java.io.IOException;
import java.util.Scanner;

public class IOProgram {
	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		String inputString = sc.nextLine();
//		System.out.println(inputString);
//		System.err.println(inputString);
		int bt;
		try {
			while((bt = System.in.read()) != -1) {
			System.out.print((char)bt);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
