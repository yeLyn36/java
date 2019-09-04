
public class SyncTest {
	private int num = 0;
	private int sum = 0;
	public synchronized void IncreaseNumber() {
		num++;	//num = num + 1
		sum += num;
	} //함수 전체에 락을 걸어놓음
	
	public void IncreaseNumber2() {
		synchronized (this) {
			num++;
		} //필요 영역만 락
		sum += num;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
