import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
			}
		
		switch(member) {
		case 1 : System.out.println("IU"); break;
		case 5 : System.out.println("ITZY"); break;
		case 7 : System.out.println("BTS"); break;
		case 9 : System.out.println("EXO"); break;
		case 13 : System.out.println("SEVENTEEN"); break;
		}
		
		int num = 2;
		for(int i = 1; i < 10; i++)
			System.out.println(num + " X " + i + " = " + num*i);
		
		System.out.println();
		
		int i = 1;
		while (i < 10) {
			System.out.println(num + " X " + i + " = " + num*i);
			i++;
		}
		
		
		System.out.print("���ڸ� �Է����ּ��� : ");
			member = sc.nextInt();
			if(member == 5)
				System.out.println("ITZY");
			if(member == 7)
				System.out.println("BTS");
			if(member == 9)
				System.out.println("EXO");
			if(member == 13)
				System.out.println("SEVENTEEN");
			if(member == 1)
				System.out.println("IU");
			
			//System.out.println(a+"");//���� + ���� = ���ڿ�
	}
}
