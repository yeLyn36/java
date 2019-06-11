
public class Score {
	private String name;
	private String address;
	private double math;
	private double english;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getTotal() {
		return getMath() + getEnglish();
	}
	
	public double getAverage() {
		return getTotal()/2;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", address=" + address 
				+ ", math=" + math + ", english=" + english 
				+ ", total=" + getTotal() + ", average=" + getAverage() + "]";
	}
}
