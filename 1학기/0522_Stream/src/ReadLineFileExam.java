import java.io.*;

public class ReadLineFileExam {
	public static void main(String[] args) {
		//파일 읽게 연결하기
		
		try {
			FileReader fr = new FileReader("src/dataw.txt");
			//버퍼 읽게 연결하기
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			//한 줄 읽기
			while((s = br.readLine()) != null) {
				//화면에 출력하기
				System.out.println(s);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
