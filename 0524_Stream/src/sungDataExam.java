import java.io.*;
import java.util.StringTokenizer;

public class sungDataExam {
	public static void main(String[] args) {
		//���� ���� (writed.txt)
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//���� ���� (readLine())
			BufferedReader br = new BufferedReader(fr);
			//���� �б�
			String csvStr = ""; //��� ���� ���� ��
			String tmpStr = ""; //���� �б� ��
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
			//System.out.println(csvStr);
			//token���� ������ �����ϱ�
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			int length = parse.countTokens() / 4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			
			for(int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken());
				english[i] = Double.parseDouble(parse.nextToken());
				//total, avg ����ϱ�
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			//���
			for(int i = 0; i < length; i++) {
				System.out.println("�̸� : " + name[i] + ", �ּ� : " + address[i] + ", ���� : " + math[i] 
						+ ", ���� : " + english[i] + ", �հ� : " + total[i] + ", ��� : " + avg[i]);			
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
