import java.io.*;

public class InputReadStreamExam {
	public static void main(String[] args) {
	
		InputStreamReader reader = new InputStreamReader(System.in);
		while(true) {
			int i;
			try {
				i= reader.read();
				if(i == -1) break;
				char c = (char)i;
				System.out.print(c);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}System.out.println();
	}
}
