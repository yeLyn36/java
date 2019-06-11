import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ScoreCalc {
	static ArrayList<Score> Scores = new ArrayList<>();
	public static void main(String[] args) {
		//���Ͽ����ϱ�
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//���� ����
			BufferedReader br = new BufferedReader(fr); 
			// 
			//
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				//�� ��ü ���� �ֱ�
				Score newScore = new Score();
				newScore.setName(st.nextToken());
				newScore.setAddress(st.nextToken());
				newScore.setMath(Double.parseDouble(st.nextToken()));
				newScore.setEnglish(Double.parseDouble(st.nextToken()));
				//����Ʈ�� �� ��ü �߰�
				Scores.add(newScore);
			}
			for (Score a : Scores) {
				System.out.println(a);
			}
//			for(int i = 0; i < Scores.size(); i++) {
//				System.out.println(Scores.get(i));
//			}
			//���� ����
			//���� ����
			FileWriter fw = new FileWriter("src/save.txt");			
			//���� ����
			BufferedWriter bw = new BufferedWriter(fw);
			//����
			for (Score s : Scores) {
				bw.write(s.getName() + "\t" + s.getAddress() + "\t"
						+ s.getMath()  + "\t" + s.getEnglish()  + "\t"
						+ s.getTotal()  + "\t" + s.getAverage());
				bw.newLine();
			}
			//�ݱ�
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
