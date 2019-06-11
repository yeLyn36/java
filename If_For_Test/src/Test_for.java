import java.util.Scanner;
import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 for(int i = 0; i == i; i++) {
			System.out.println("멤버 수 입력 : ");
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
				System.out.println("그룹 미지정");
				break;
			}
		}
		 
		 System.out.println("반 번호 --------------------------------------------------------------------");
		 String names[] = {"강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", 
				 			"원예린", "원채린", "이서현", "이채린", "이현수", "임현진", "장유경", "장원이", "한다연"};
		 //for (String string : names) { }
		 for (int i = 0; i == i; i++) {
			 System.out.println("번호를 입력해주세요 : ");
			 int num = sc.nextInt();
			 if(num <= 19 && num >= 1)
				 System.out.println("이름 : " + names[num-1]);
			 else {
				 System.out.println("더 이상 인원이 없습니다.");
				 break;
			 }			 
		 }
	}
}
