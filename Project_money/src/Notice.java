// 카드 사용의 알림에서 사용할 속성과 메서드를 갖고 있다.
public class Notice {
	private int	numOfCharge = 0;
	private boolean whetherCharging;
	
	public void setWhetherCharging(boolean whetherCharging){
		this.whetherCharging = whetherCharging;
	}// 카드의 자동 충전 여부를 설정한다.
	
	public int getNumOfCharge() {
		return numOfCharge++;
	}// 자동충전의 횟수를 가져온다.
	
	public boolean getWhetherCharging() {
		return whetherCharging;
	}// 카드의 자동충전 여부를 가져온다.
}
