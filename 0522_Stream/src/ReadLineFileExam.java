import java.io.*;

public class ReadLineFileExam {
	public static void main(String[] args) {
		//���� �а� �����ϱ�
		
		try {
			FileReader fr = new FileReader("src/dataw.txt");
			//���� �а� �����ϱ�
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			//�� �� �б�
			while((s = br.readLine()) != null) {
				//ȭ�鿡 ����ϱ�
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
