
public class p151_tryCatch {
	public static void main(String[] args) {
		String[] irum = new String[3];
		irum[0] = "��ä��";
		irum[1] = "��ä��";
		irum[2] = "������";
		try {
			for(int i = 0; i <= irum.length; i++) {
				System.out.println(irum[i]);
			}			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �߻�");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("������ ����");
		}
	}
}
