package langTest;

import javax.security.auth.Subject;

public class Program {
	public static void main(String[] args) {
		String str1 = "mirim";
		String str2 = "mirim";
		String str3 = new String("mirim");
		String str4 = new String("mirim");
		
		if(str1 == str2) System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str3 == str4) System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str1.equals(str2)) System.out.println("���� ����");
		else System.out.println("���� �ٸ���");
		if(str3.equals(str4)) System.out.println("���� ����");
		else System.out.println("���� �ٸ���");
		
		System.out.println("------------------------------------");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(String.valueOf(123));
		System.out.println("   Happy Programming :  ".trim());
		System.out.println("2311".substring(2, 4));
	}
}
