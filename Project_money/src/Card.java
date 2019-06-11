
public class Card extends Notice{
	private String cardName;
	private String kindsOfCard;
	private String cardNumber;
	private int limitedAmount;
	private int currentAmount;
	private int chargeAmount;
	private String cardOwner;
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getKindsOfCard() {
		return kindsOfCard;
	}
	public void setKindsOfCard(String kindsOfCard) {
		this.kindsOfCard = kindsOfCard;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getLimitedAmount() {
		return limitedAmount;
	}
	public void setLimitedAmount(int limitedAmount) {
		this.limitedAmount = limitedAmount;
	}
	
	public int getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	
	public String getCardOwner() {
		return cardOwner;
	}
	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}
	
	public int getCurrentAmount() {
		return currentAmount;
	}
	
	
}
