import java.util.Scanner;

public class User {
	static Scanner sc = new Scanner(System.in);
	private String userName; //사용자명
	static Card[] card = new Card[10];
	static int i;
	
	public void registerCard(Card card, int i) {
		
		System.out.print("카드명을 입력해주세요 : ");
		card.setCardName(sc.next());
		sc.nextLine();
		System.out.print("카드종류을 입력해주세요 (교통카드, 신용카드, 체크카드 등): ");
		card.setKindsOfCard(sc.nextLine());
		System.out.print("카드 소유주을 입력해주세요 : ");
		card.setCardOwner(sc.nextLine());
		System.out.print("카드 고유번호을 입력해주세요 : ");
		card.setCardNumber(sc.nextLine());
		System.out.print("사용 제한금액을 설정해주세요 (단위 : 원): ");
		card.setLimitedAmount(Integer.parseInt(sc.nextLine()));
		System.out.print("잔액 제한시 충전 금액을 설정해주세요 (단위 : 원): ");
		card.setChargeAmount(Integer.parseInt(sc.nextLine()));
		System.out.println();
		
		System.out.println("------------카드 등록 완료------------");
		System.out.println("카드명 :" + card.getCardName() + "\n카드 소유주 : " + card.getCardOwner() 
				+ "\n카드 종류 : " + card.getKindsOfCard() + "\n카드 고유 번호 : " + card.getCardNumber()
				+ " \n카드 사용 제한 금액 : " + card.getLimitedAmount() 
				+ "원\n충전 시 금액 : " + card.getChargeAmount() + "원\n"
				+ "\n카드 등록 완료 (" + (++i) + "/10). 전 화면으로 돌아갑니다.\n");
	} //위와 같이 처음의 정보를 입력.
	
	public void useCard() {
		//카드 사용, 잔액 확인 및 충전 여부
		System.out.println("어느 카드를 사용하시겠습니까?");
	}
	public void showCardInfo() {
		
	}//카드의 정보 열람
	public void editCardInfo() {
		
	}//카드의 정보 편집
	
	//setUserName, getUserName 추가
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static void main(String args[]) {
		User user = new User();
		card[i] = new Card();
		i = 0;
		//사용자의 이름 입력 및 확인
		System.out.println("--- 프로그램이 시작합니다. ---");
		System.out.print("사용자의 성명을 입력해주세요 : ");
		user.setUserName(sc.nextLine());
		//첫 사용자는 등록을 먼저 하게함.
		System.out.println("첫 카드를 등록합니다.");
		user.registerCard(card[i], i);
		
		while(true) {
			i++;
			System.out.println("원하시는 기능을 선택해주세요 ( 1: 카드 등록 | 2: 카드 사용 | 3: 카드 정보 | 4: 정보 편집  | 5: 종료 )");
			int number = sc.nextInt();
			//카드 등록, 사용, 열람, 편집 등 선택.
			switch(number) {
				case 1 : 
					if (i == 10) {	System.out.println("카드 등록이 불가합니다. 정보 편집에 들어가 카드를 삭제해주세요."); break;	}
					card[i] = new Card(); user.registerCard(card[i], i); break;
				case 2 : user.useCard(); break;
				case 3 : user.showCardInfo(); break;
				case 4 : user.editCardInfo(); break;
				//사용이 끝났을 경우, (나가기)를 선택하여 프로그램 종료
				case 5 : System.out.println("프로그램을 종료합니다."); System.exit(0); break;
				default : System.out.println("다시 입력해주세요."); break;
			} //switch end
		} //while end
	} //main end
} //class end
