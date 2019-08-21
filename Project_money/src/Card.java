// 카드의 기본적인 정보의 속성과 메서드를 갖고 있다.
public class Card extends Notice{
	private String cardName; 
	private String kindsOfCard;
	private String cardNumber;
	private int limitedAmount;
	private long currentAmount = (int)(((Math.random() * 100) + 1)*10000); //실제 카드의 돈을 어떻게 가져올지는 알 수 없음. 하지만 우선 임의 돈을 설정함.
	private int chargeAmount;
	private String cardOwner;
	
	public String getCardName() {
		return cardName;
	}//카드명 가져오기
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}//카드명 설정
	
	public String getKindsOfCard() {
		return kindsOfCard;
	}//카드종류 가져오기
	public void setKindsOfCard(String kindsOfCard) {
		this.kindsOfCard = kindsOfCard;
	}//카드종류 설정
	
	public String getCardNumber() {
		return cardNumber;
	}//카드고유번호 가져오기
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}//카드고유번호 설정
	
	public int getLimitedAmount() {
		return limitedAmount;
	}//카드제한금액 가져오기
	public void setLimitedAmount(int limitedAmount) {
		this.limitedAmount = limitedAmount;
	}//카드제한금액 설정
	
	public int getChargeAmount() {
		return chargeAmount;
	}//카드충전금액 가져오기
	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}//카드충전금액 설정
	
	public String getCardOwner() {
		return cardOwner;
	}//카드소유주 가져오기
	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}//카드소유주 설정
	
	public long getCurrentAmount() {
		return currentAmount;
	}//카드 현재 잔액 가져오기
	public void setCurrentAmount(long l) {
		this.currentAmount = l;
	}//카드 현재 잔액 설정
	
	
}
