import java.io.IOException;

public class ReadFromSysExam {
	public static void main(String[] args) {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); - 함수 실패 시 알림
			System.out.println("입력실패");
		}
		System.out.write(b, 0, len);
	}
}
