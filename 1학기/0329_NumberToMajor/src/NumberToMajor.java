import java.util.Scanner;

public class NumberToMajor {
	private static String[] grade3 = {"인터랙티브미디어과","인터랙티브미디어과", "뉴미디어디자인과", "뉴미디어디자인과", "뉴미디어솔루션과", "뉴미디어솔루션과"};
	private static String[] grade2 = {"뉴미디어소프트웨어과","뉴미디어소프트웨어과", "뉴미디어웹솔루션과", "뉴미디어웹솔루션과", "뉴미디어디자인과", "뉴미디어디자인과"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력해주세요 : ");
		String num = sc.next();
	
		if(num.substring(0,1).equals("3")) {
			//if(num.charAt(0) == '3'){
			String classStr = num.substring(1, 2);
			int classroom = Integer.parseInt(classStr)-1;
			System.out.println(grade3[classroom]);
//			if(num.substring(1, 2).equals("1") || num.substring(1, 2).equals("2"))
//				System.out.println("인터랙티브미디어과");
//			else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4"))
//				System.out.println("뉴미디어디자인과");
//			else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6"))
//				System.out.println("뉴미디어솔루션과");
		}

		else {
			String classStr = num.substring(1, 2);
			int classroom = Integer.parseInt(classStr)-1;
			System.out.println(grade2[classroom]);
//			if((num.substring(1, 2)).equals("1") || (num.substring(1, 2)).equals("2"))
//				System.out.println("뉴미디어소프트웨어과");
//			else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4"))
//				System.out.println("뉴미디어웹솔루션과");
//			else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6"))
//				System.out.println("뉴미디어디자인과");
		}
	}
}
