import java.util.Scanner;

public class NumberToMajor {
	private static String[] grade3 = {"���ͷ�Ƽ��̵���","���ͷ�Ƽ��̵���", "���̵������ΰ�", "���̵������ΰ�", "���̵��ַ�ǰ�", "���̵��ַ�ǰ�"};
	private static String[] grade2 = {"���̵�����Ʈ�����","���̵�����Ʈ�����", "���̵�����ַ�ǰ�", "���̵�����ַ�ǰ�", "���̵������ΰ�", "���̵������ΰ�"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�й��� �Է����ּ��� : ");
		String num = sc.next();
	
		if(num.substring(0,1).equals("3")) {
			//if(num.charAt(0) == '3'){
			String classStr = num.substring(1, 2);
			int classroom = Integer.parseInt(classStr)-1;
			System.out.println(grade3[classroom]);
//			if(num.substring(1, 2).equals("1") || num.substring(1, 2).equals("2"))
//				System.out.println("���ͷ�Ƽ��̵���");
//			else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4"))
//				System.out.println("���̵������ΰ�");
//			else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6"))
//				System.out.println("���̵��ַ�ǰ�");
		}

		else {
			String classStr = num.substring(1, 2);
			int classroom = Integer.parseInt(classStr)-1;
			System.out.println(grade2[classroom]);
//			if((num.substring(1, 2)).equals("1") || (num.substring(1, 2)).equals("2"))
//				System.out.println("���̵�����Ʈ�����");
//			else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4"))
//				System.out.println("���̵�����ַ�ǰ�");
//			else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6"))
//				System.out.println("���̵������ΰ�");
		}
	}
}
