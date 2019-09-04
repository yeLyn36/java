import java.io.*;

public class BufferReaderExam {
 public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String aa = br.readLine();
		System.out.println(aa);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
}
