import java.util.Scanner;
import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 for(int i = 0; i == i; i++) {
			System.out.println("��� �� �Է� : ");
			int member = sc.nextInt();
			
			if(member == 5)
				System.out.println("ITZY");
			else if(member == 7)
				System.out.println("BTS");
			else if(member == 9)
				System.out.println("EXO");
			else if(member == 13)
				System.out.println("SEVENTEEN");
			else if(member == 1)
				System.out.println("IU");
			else {
				System.out.println("�׷� ������");
				break;
			}
		}
		 
		 System.out.println("�� ��ȣ --------------------------------------------------------------------");
		 String names[] = {"������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", 
				 			"������", "��ä��", "�̼���", "��ä��", "������", "������", "������", "�����", "�Ѵٿ�"};
		 //for (String string : names) { }
		 for (int i = 0; i == i; i++) {
			 System.out.println("��ȣ�� �Է����ּ��� : ");
			 int num = sc.nextInt();
			 if(num <= 19 && num >= 1)
				 System.out.println("�̸� : " + names[num-1]);
			 else {
				 System.out.println("�� �̻� �ο��� �����ϴ�.");
				 break;
			 }			 
		 }
	}
}
