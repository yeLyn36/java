//2311 ������
/* "��, �ܾ��� �����մϴ�." ��뼳����
 	�� ���α׷��� ��ϵ� ī�带 ����ϴٰ�, �̸� �����س��� ���� �ݾ׿� �����ϸ� �̸� �����س��� ���� ���� �ݾ���
 	�ڵ� �������ִ� ���α׷��Դϴ�.
 	������ User.java ���Ͽ��� �������ֽø� �˴ϴ�.
 	�����Ű�� ù ������� �̸��� �Է¹޽��ϴ�. 
 	���� ī�� ����ϱ�, ī�� ����ϱ�, ī�� ���� ����, ī�� ���� ���� �� �����ϱ�, ���� ����� �����Ͽ� ���ϴ� ����� �����Ͻø� �˴ϴ�.
	 1. ī�� ����ϱ� 
	 	��µǴ� ������ ���� �亯�� ���ָ� �ش� �亯�� ���� ī�尡 ��ϵ˴ϴ�. ī��� 10�������� ����� �� �ְ�, ī���� ������ ���� ó������
	 	����ϴ� ����Դϴ�.
	 2. ī�� ����ϱ�
	 	��ϵ� ī�带 ����K �� �ֵ��� �ϴ� ����Դϴ�. ��ϵ� ī�带 �����ϰ�, �� �� ��������� ��ȣ�� �Է��ϸ�  ī���� ��� �ݾ��� �����մϴ�.
	 	�亯�ϸ� ī��� ���ݾ׿� ���� ��� ���� �ܾ��� ��µ˴ϴ�. �̶� ���� �ݾ׿� �������� ���, ���� ���ΰ� true�� ��� �ڵ� ����, false��
	 	���, �� �� ����� yes�� �� ����, no�� �� �׳� �Ѿ�� �˴ϴ�. ��ϵ� ī�尡 ���� ��� ����� �� ���� ����Դϴ�.
	 3.	ī�� ��������
	 	��ϵ� ī���� ������ ������ �� �ִ� ����Դϴ�. ��ϵ� ī�带 �����ϰ�, �� �� ������� ��ȣ�� �Է��ϸ� 1������ ����� ī���� ������ �ش� ī�忡 ���߾�
	 	��µ˴ϴ�. ��ϵ� ī�尡 ���� ��� ����� �� ���� ����Դϴ�.
	 4. ī�� ���� ���� �� �����ϱ�
	 	��ϵ� ī���� ������ �����ϰ� �ش� ī�带 ������ �� �ִ� ����Դϴ�. ��ϵ� ī�带 �����ϰ�, �� �� ������� ��ȣ�� �Է��ϸ� 1������ ����� ī�带
	 	 ���� �� ������ �� �ֽ��ϴ�. ������ �������� ��� �� �ش� ī�带 �ٽ� 1������ ������ ������, ������ ������ ��� �迭���� �����մϴ�.
	 	 �� ��� ���� ��ϵ� ī�尡 ���� ��� ����� �� ���� ����Դϴ�.
	5. �ش� ��ȣ�� �������� ���, ���α׷��� �����մϴ�.
	�ƹ� ��ȣ�� �������� �ʾҰų�, �� ��ȣ�� �ش����� �ʴ� ��ȣ�� ������ ���� �޴� ������ ���Է¹޽��ϴ�.
	������ּż� �����մϴ�.
 */

import java.util.Scanner;

public class User {
	static Scanner sc = new Scanner(System.in);
	private String userName; //����ڸ�
	static Card[] card = new Card[10];
	static int i;
	
	public void registerCard(Card card, int i) { 		
		System.out.print("ī����� �Է����ּ��� : ");
		card.setCardName(sc.next());
		sc.nextLine();
		System.out.print("ī�������� �Է����ּ��� (����ī��, �ſ�ī��, üũī�� ��): ");
		card.setKindsOfCard(sc.nextLine());
		System.out.print("ī�� �������� �Է����ּ��� : ");
		card.setCardOwner(sc.nextLine());
		System.out.print("ī�� ������ȣ�� �Է����ּ��� : ");
		card.setCardNumber(sc.nextLine());
		System.out.print("��� ���ѱݾ��� �������ּ��� (���� : ��): ");
		card.setLimitedAmount(Integer.parseInt(sc.nextLine()));
		System.out.print("�ܾ� ���ѽ� ���� �ݾ��� �������ּ��� (���� : ��): ");
		card.setChargeAmount(Integer.parseInt(sc.nextLine()));
		System.out.print("�ڵ� ���� ���θ� �������ּ��� (0 : �㰡 | 1: �Ұ� | ���Է½� �Ұ��� ����): ");
		int num = sc.nextInt();
		if(num == 0) {
			card.setWhetherCharging(true);
		} //if end
		else {
			card.setWhetherCharging(false);
		} //else end
		System.out.println();
		
		System.out.println("------------ī�� ��� �Ϸ�------------");
		System.out.println("ī��� :" + card.getCardName() + "\nī�� ������ : " + card.getCardOwner() 
				+ "\nī�� ���� : " + card.getKindsOfCard() + "\nī�� ���� ��ȣ : " + card.getCardNumber()
				+ " \nī�� ��� ���� �ݾ� : " + card.getLimitedAmount() 
				+ "��\n���� �� �ݾ� : " + card.getChargeAmount() + "��\n"
				+ "\nī�� ��� �Ϸ� (" + (++i) + "/10). �� ȭ������ ���ư��ϴ�.\n");
	} //���� ���� ī���� ������ ó�� �Է��Ͽ� ����ϴ� �Լ����ϴ�.
	
	public void useCard() {
		if(i == 0) { 
			System.out.println("��ϵ� ī�尡 �����ϴ�. ���� ������ֽʽÿ�.");
			return;
		} //if end
		//ī�尡 ������ ��� �˸�
		//ī�� ���, �ܾ� Ȯ�� �� ���� ����
		int cardName;
		
		while(true) {
			System.out.println("� ī�带 ����Ͻðڽ��ϱ� ? (��ȣ �Է�)\n��ϵ� ī�� : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} //for end
			System.out.println();
			cardName = sc.nextInt();
			if(cardName <= i && cardName > 0) {
				break;
			} //if end
			else { 
				System.out.println("���� ī���Դϴ�.");
			} //else end
		} //while end
		System.out.println("�󸶸� ����ϼ̽��ϱ� ?");
		int money = sc.nextInt();
		
		for (int n = 0; n < i; n++) {
			if(card[n] == card[cardName-1]) {
				card[n].setCurrentAmount(card[n].getCurrentAmount()-money);
				System.out.println("-----------------NOTICE-----------------");
				System.out.println(card[n].getCardName() + "�� �ܾ��� " + card[n].getCurrentAmount() + "�Դϴ�.\n");
				if(card[n].getCurrentAmount() <= card[n].getLimitedAmount()) {
					if(card[n].getWhetherCharging()) {
						System.out.println("���� �ݾ� " + card[n].getChargeAmount() + "���� �ڵ� �����մϴ�.");
						card[n].setCurrentAmount((card[n].getCurrentAmount() + card[n].getChargeAmount()));
						System.out.println("���� �ܾ��� " + card[n].getCurrentAmount() + "�Դϴ�.");
						System.out.println("���� �� " + card[n].getNumOfCharge() + "�Դϴ�.");
					}
					else {
						while(true) {
							System.out.println("�ܾ��� ���� �ݾ׿� �����Ͽ����ϴ�. �����Ͻðڽ��ϱ�? (y | n)");
							String c = sc.next();
							if(c.equals("y") || c.equals("Y")) {
								System.out.println("���� �ݾ� " + card[n].getChargeAmount() + "���� �ڵ� �����մϴ�.");
								card[n].setCurrentAmount((card[n].getCurrentAmount() + card[n].getChargeAmount()));
								System.out.println("���� �ܾ��� " + card[n].getCurrentAmount() + "�Դϴ�.");
								System.out.println("���� �� " + card[n].getNumOfCharge() + "�Դϴ�.");
								break;
							}
							else if(c.equals("n") || c.equals("N")) {
								System.out.println("�޴��� ���ư��ϴ�.");
								break;
							}
							else {
								System.out.println("�ٽ� �Է����ּ���.");
							}
						}
					}
				}
			}
		}System.out.println();
	} // ī�带 ����Ͽ�, �׿� ���� ������ ����ϴ� �Լ��Դϴ�.
	
	public void showCardInfo() {
		if(i == 0) { 
			System.out.println("��ϵ� ī�尡 �����ϴ�. ���� ������ֽʽÿ�.");
			return;
		}//ī�尡 ������ ��� �˸�
		int cardNum; 
		
		while(true) {
			System.out.println("� ī���� ������ ���ðڽ��ϱ� ? (��ȣ �Է�)\n��ϵ� ī�� : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} System.out.println();
			cardNum = sc.nextInt();
			if(cardNum <= i && cardNum > 0) {
				break;
			}
			else { 
				System.out.println("���� ī���Դϴ�.");
			}
		}
		System.out.println("ī��� : " + card[cardNum-1].getCardName());
		System.out.println("ī������ : " + card[cardNum-1].getKindsOfCard());
		System.out.println("ī������� : " + card[cardNum-1].getCardOwner());
		System.out.println("ī���ȣ : " + card[cardNum-1].getCardNumber());
		System.out.println("���� �ݾ� : " + card[cardNum-1].getLimitedAmount());
		System.out.println("���� �ݾ� : " + card[cardNum-1].getChargeAmount());
		System.out.println("���� �ܾ�: " + card[cardNum-1].getCurrentAmount());
		System.out.println("�ڵ� ���� ���� : " + card[cardNum-1].getWhetherCharging());
	}// ������ ī���� ������ ����Ͽ� ������ �� �ֵ��� �ϴ� �Լ��Դϴ�.
	
	public void editCardInfo() {
		if(i == 0) { 
			System.out.println("��ϵ� ī�尡 �����ϴ�. ���� ������ֽʽÿ�.");
			return;
		}//ī�尡 ������ ��� �˸�
		int cardName;
		
		while(true) {
			System.out.println("� ī�带 �����Ͻðڽ��ϱ� ? (��ȣ �Է�)\n��ϵ� ī�� : ");
			for(int n = 1; n <= i; n++) {
				System.out.print(n + ". " + card[n-1].getCardName() + "\t");
			} System.out.println();
			cardName = sc.nextInt();
			if(cardName <= i && cardName > 0) {
				break;
			}
			else { 
				System.out.println("���� ī���Դϴ�.");
			}
		}
		System.out.println("��ȣ�� �������ּ��� (1.���� | 2.����) : ");
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
	}// ������ ī���� ���� ���� �� ������ �� �� �ִ� ����Դϴ�.
	
	//setUserName, getUserName �߰�
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static void main(String args[]) {
		User user = new User(); // ����� ��ü ���� 
		// ������� �̸� �Է� �� Ȯ��
		System.out.println("--- ���α׷��� �����մϴ�. ---");
		System.out.print("������� ������ �Է����ּ��� : ");
		user.setUserName(sc.nextLine());
		
		while(true) {
			System.out.println("���Ͻô� ����� �������ּ��� ( 1: ī�� ��� | 2: ī�� ��� | 3: ī�� ���� | 4: ���� ����  | 5: ���� )");
			int number = sc.nextInt();
			// ī�� ���, ���, ����, ���� �� ����.
			switch(number) {
				case 1 : // 10�� ������ ī�常 ��ϰ���
					if (i == 10) {	System.out.println("ī�� ����� �Ұ��մϴ�. ���� ������ �� ī�带 �������ּ���."); break;	}
					card[i] = new Card(); // ī�� �迭���� ��ü ���� 
					user.registerCard(card[i], i); // �ش� ī�� ��ȣ�� ī�� ���
					i++; // ī�� ��ȣ�� ����
					break;
				case 2 : user.useCard(); break; // ī�� ���
				case 3 : user.showCardInfo(); break; // ī�� ���� ����
				case 4 : user.editCardInfo(); break; // ī�� ���� ����
				//����� ������ ���, (������)�� �����Ͽ� ���α׷� ����
				case 5 : System.out.println(user.getUserName() + "��  ��������ּż� �����մϴ�. ���α׷��� �����մϴ�."); System.exit(0); break;
				default : System.out.println("�ٽ� �Է����ּ���."); break;
			} //switch end
		} //while end
	} //main end
} //class end
