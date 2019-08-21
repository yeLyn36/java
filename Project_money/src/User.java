//2311 원예린
/* "띵, 잔액이 부족합니다." 사용설명서ㄴ
 	위 프로그램은 등록된 카드를 사용하다가, 미리 설정해놓은 제한 금액에 도달하면 미리 설정해놓은 제한 충전 금액을
 	자동 충전해주는 프로그램입니다.
 	실행은 User.java 파일에서 실행해주시면 됩니다.
 	실행시키면 첫 사용자의 이름을 입력받습니다. 
 	이후 카드 등록하기, 카드 사용하기, 카드 정보 보기, 카드 정보 편집 및 삭제하기, 종료 기능을 선택하여 원하는 기능을 실행하시면 됩니다.
	 1. 카드 등록하기 
	 	출력되는 질문에 따라 답변을 해주면 해당 답변에 따라 카드가 등록됩니다. 카드는 10개까지만 등록할 수 있고, 카드의 정보를 가장 처음으로
	 	등록하는 기능입니다.
	 2. 카드 사용하기
	 	등록된 카드를 사용핳 수 있도록 하는 기능입니다. 등록된 카드를 나열하고, 그 중 순서대로의 번호를 입력하면  카드의 사용 금액을 질문합니다.
	 	답변하면 카드와 사용금액에 따라 사용 후의 잔액이 출력됩니다. 이때 제한 금액에 도달했을 경우, 제한 여부가 true일 경우 자동 충전, false일
	 	경우, 한 번 물어보고 yes일 시 충전, no일 시 그냥 넘어가게 됩니다. 등록된 카드가 없을 경우 사용할 수 없는 기능입니다.
	 3.	카드 정보보기
	 	등록된 카드의 정보를 열람할 수 있는 기능입니다. 등록된 카드를 나열하고, 그 중 순서대로 번호를 입력하면 1번에서 등록한 카드의 정보가 해당 카드에 맞추어
	 	출력됩니다. 등록된 카드가 없을 경우 사용할 수 없는 기능입니다.
	 4. 카드 정보 편집 및 삭제하기
	 	등록된 카드의 정보를 편집하고 해당 카드를 삭제할 수 있는 기능입니다. 등록된 카드를 나열하고, 그 중 순서대로 번호를 입력하면 1번에서 등록한 카드를
	 	 편집 및 삭제할 수 있습니다. 편집을 선택했을 경우 그 해당 카드를 다시 1번으로 돌려서 재편집, 삭제를 눌렀을 경우 배열에서 제거합니다.
	 	 이 기능 역시 등록된 카드가 없을 경우 사용할 수 없는 기능입니다.
	5. 해당 번호를 선택했을 경우, 프로그램을 종료합니다.
	아무 번호도 선택하지 않았거나, 위 번호에 해당하지 않는 번호를 눌렀을 때는 메뉴 선택을 재입력받습니다.
	사용해주셔서 감사합니다.
 */

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
		System.out.print("자동 충전 여부를 설정해주세요 (0 : 허가 | 1: 불가 | 미입력시 불가로 설정): ");
		int num = sc.nextInt();
		if(num == 0) {
			card.setWhetherCharging(true);
		} //if end
		else {
			card.setWhetherCharging(false);
		} //else end
		System.out.println();
		
		System.out.println("------------카드 등록 완료------------");
		System.out.println("카드명 :" + card.getCardName() + "\n카드 소유주 : " + card.getCardOwner() 
				+ "\n카드 종류 : " + card.getKindsOfCard() + "\n카드 고유 번호 : " + card.getCardNumber()
				+ " \n카드 사용 제한 금액 : " + card.getLimitedAmount() 
				+ "원\n충전 시 금액 : " + card.getChargeAmount() + "원\n"
				+ "\n카드 등록 완료 (" + (++i) + "/10). 전 화면으로 돌아갑니다.\n");
	} //위와 같이 카드의 정보를 처음 입력하여 등록하는 함수힙니다.
	
	public void useCard() {
		if(i == 0) { 
			System.out.println("등록된 카드가 없습니다. 먼저 등록해주십시오.");
			return;
		} //if end
		//카드가 없으면 등록 알림
		//카드 사용, 잔액 확인 및 충전 여부
		int cardName;
		
		while(true) {
			System.out.println("어떤 카드를 사용하시겠습니까 ? (번호 입력)\n등록된 카드 : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} //for end
			System.out.println();
			cardName = sc.nextInt();
			if(cardName <= i && cardName > 0) {
				break;
			} //if end
			else { 
				System.out.println("없는 카드입니다.");
			} //else end
		} //while end
		System.out.println("얼마를 사용하셨습니까 ?");
		int money = sc.nextInt();
		
		for (int n = 0; n < i; n++) {
			if(card[n] == card[cardName-1]) {
				card[n].setCurrentAmount(card[n].getCurrentAmount()-money);
				System.out.println("-----------------NOTICE-----------------");
				System.out.println(card[n].getCardName() + "의 잔액은 " + card[n].getCurrentAmount() + "입니다.\n");
				if(card[n].getCurrentAmount() <= card[n].getLimitedAmount()) {
					if(card[n].getWhetherCharging()) {
						System.out.println("충전 금액 " + card[n].getChargeAmount() + "원을 자동 충전합니다.");
						card[n].setCurrentAmount((card[n].getCurrentAmount() + card[n].getChargeAmount()));
						System.out.println("현재 잔액은 " + card[n].getCurrentAmount() + "입니다.");
						System.out.println("현재 총 " + card[n].getNumOfCharge() + "입니다.");
					}
					else {
						while(true) {
							System.out.println("잔액이 제한 금액에 도달하였습니다. 충전하시겠습니까? (y | n)");
							String c = sc.next();
							if(c.equals("y") || c.equals("Y")) {
								System.out.println("충전 금액 " + card[n].getChargeAmount() + "원을 자동 충전합니다.");
								card[n].setCurrentAmount((card[n].getCurrentAmount() + card[n].getChargeAmount()));
								System.out.println("현재 잔액은 " + card[n].getCurrentAmount() + "입니다.");
								System.out.println("현재 총 " + card[n].getNumOfCharge() + "입니다.");
								break;
							}
							else if(c.equals("n") || c.equals("N")) {
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
							else {
								System.out.println("다시 입력해주세요.");
							}
						}
					}
				}
			}
		}System.out.println();
	} // 카드를 사용하여, 그에 따른 정보를 출력하는 함수입니다.
	
	public void showCardInfo() {
		if(i == 0) { 
			System.out.println("등록된 카드가 없습니다. 먼저 등록해주십시오.");
			return;
		}//카드가 없으면 등록 알림
		int cardNum; 
		
		while(true) {
			System.out.println("어떤 카드의 정보를 보시겠습니까 ? (번호 입력)\n등록된 카드 : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} System.out.println();
			cardNum = sc.nextInt();
			if(cardNum <= i && cardNum > 0) {
				break;
			}
			else { 
				System.out.println("없는 카드입니다.");
			}
		}
		System.out.println("카드명 : " + card[cardNum-1].getCardName());
		System.out.println("카드종류 : " + card[cardNum-1].getKindsOfCard());
		System.out.println("카드소유자 : " + card[cardNum-1].getCardOwner());
		System.out.println("카드번호 : " + card[cardNum-1].getCardNumber());
		System.out.println("제한 금액 : " + card[cardNum-1].getLimitedAmount());
		System.out.println("충전 금액 : " + card[cardNum-1].getChargeAmount());
		System.out.println("현재 잔액: " + card[cardNum-1].getCurrentAmount());
		System.out.println("자동 충전 여부 : " + card[cardNum-1].getWhetherCharging());
	}// 선택한 카드의 정보를 출력하여 열람할 수 있도록 하는 함수입니다.
	
	public void editCardInfo() {
		if(i == 0) { 
			System.out.println("등록된 카드가 없습니다. 먼저 등록해주십시오.");
			return;
		}//카드가 없으면 등록 알림
		int cardName;
		
		while(true) {
			System.out.println("어떤 카드를 편집하시겠습니까 ? (번호 입력)\n등록된 카드 : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} System.out.println();
			cardName = sc.nextInt();
			if(cardName <= i && cardName > 0) {
				break;
			}
			else { 
				System.out.println("없는 카드입니다.");
			}
		}
		System.out.println("번호를 선택해주세요 (1.편집 | 2.삭제) : ");
		int num = sc.nextInt();
		switch(num) {
			case 1: registerCard(card[cardName-1], cardName-1); break;
			case 2: 
				for (int n = cardName-1; n <= i; n++) {
					card[n] = card[n+1];
				} card[i] = null;
				i--;
				break;
		} 
	}// 선택한 카드의 정보 편집 및 삭제를 할 수 있는 기능입니다.
	
	//setUserName, getUserName 추가
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static void main(String args[]) {
		User user = new User(); // 사용자 객체 생성 
		// 사용자의 이름 입력 및 확인
		System.out.println("--- 프로그램이 시작합니다. ---");
		System.out.print("사용자의 성명을 입력해주세요 : ");
		user.setUserName(sc.nextLine());
		
		while(true) {
			System.out.println("원하시는 기능을 선택해주세요 ( 1: 카드 등록 | 2: 카드 사용 | 3: 카드 정보 | 4: 정보 편집  | 5: 종료 )");
			int number = sc.nextInt();
			// 카드 등록, 사용, 열람, 편집 등 선택.
			switch(number) {
				case 1 : // 10개 이하의 카드만 등록가능
					if (i == 10) {	System.out.println("카드 등록이 불가합니다. 정보 편집에 들어가 카드를 삭제해주세요."); break;	}
					card[i] = new Card(); // 카드 배열에서 객체 생성 
					user.registerCard(card[i], i); // 해당 카드 번호로 카드 등록
					i++; // 카드 번호수 증가
					break;
				case 2 : user.useCard(); break; // 카드 사용
				case 3 : user.showCardInfo(); break; // 카드 정보 열람
				case 4 : user.editCardInfo(); break; // 카드 정보 편집
				//사용이 끝났을 경우, (나가기)를 선택하여 프로그램 종료
				case 5 : System.out.println(user.getUserName() + "님  사용주해주셔서 감사합니다. 프로그램을 종료합니다."); System.exit(0); break;
				default : System.out.println("다시 입력해주세요."); break;
			} //switch end
		} //while end
	} //main end
} //class end
