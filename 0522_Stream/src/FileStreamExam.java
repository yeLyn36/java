import java.io.*;

public class FileStreamExam {
	public static void main(String[] args) {
		byte[] b = new byte[1024];
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("src/tin.txt");
			fos = new FileOutputStream("src/tout.txt");
			fis.read(b);
			fos.write(b);
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
