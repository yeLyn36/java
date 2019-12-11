import java.io.*;

public class FileExam {
	public static void main(String[] args){
			try {
				FileReader file = new FileReader("test.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
