// ī���� �⺻���� ������ �Ӽ��� �޼��带 ���� �ִ�.
public class Card extends Notice{
	private String cardName; 
	private String kindsOfCard;
	private String cardNumber;
	private int limitedAmount;
	private long currentAmount = (int)(((Math.random() * 100) + 1)*10000); //���� ī���� ���� ��� ���������� �� �� ����. ������ �켱 ���� ���� ������.
	private int chargeAmount;
	private String cardOwner;
	
	public String getCardName() {
		return cardName;
	}//ī��� ��������
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}//ī��� ����
	
	public String getKindsOfCard() {
		return kindsOfCard;
	}//ī������ ��������
	public void setKindsOfCard(String kindsOfCard) {
		this.kindsOfCard = kindsOfCard;
	}//ī������ ����
	
	public String getCardNumber() {
		return cardNumber;
	}//ī�������ȣ ��������
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}//ī�������ȣ ����
	
	public int getLimitedAmount() {
		return limitedAmount;
	}//ī�����ѱݾ� ��������
	public void setLimitedAmount(int limitedAmount) {
		this.limitedAmount = limitedAmount;
	}//ī�����ѱݾ� ����
	
	public int getChargeAmount() {
		return chargeAmount;
	}//ī�������ݾ� ��������
	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}//ī�������ݾ� ����
	
	public String getCardOwner() {
		return cardOwner;
	}//ī������� ��������
	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}//ī������� ����
	
	public long getCurrentAmount() {
		return currentAmount;
	}//ī�� ���� �ܾ� ��������
	public void setCurrentAmount(long l) {
		this.currentAmount = l;
	}//ī�� ���� �ܾ� ����
	
	
}
