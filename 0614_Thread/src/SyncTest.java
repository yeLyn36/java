
public class SyncTest {
	private int num = 0;
	private int sum = 0;
	public synchronized void IncreaseNumber() {
		num++;	//num = num + 1
		sum += num;
	} //�Լ� ��ü�� ���� �ɾ����
	
	public void IncreaseNumber2() {
		synchronized (this) {
			num++;
		} //�ʿ� ������ ��
		sum += num;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
