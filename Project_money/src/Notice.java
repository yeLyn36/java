// ī�� ����� �˸����� ����� �Ӽ��� �޼��带 ���� �ִ�.
public class Notice {
	private int	numOfCharge = 0;
	private boolean whetherCharging;
	
	public void setWhetherCharging(boolean whetherCharging){
		this.whetherCharging = whetherCharging;
	}// ī���� �ڵ� ���� ���θ� �����Ѵ�.
	
	public int getNumOfCharge() {
		return numOfCharge++;
	}// �ڵ������� Ƚ���� �����´�.
	
	public boolean getWhetherCharging() {
		return whetherCharging;
	}// ī���� �ڵ����� ���θ� �����´�.
}
