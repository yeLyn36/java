
public class IOProgram {
	public static void main(String[] args) {
		
	int bt;
	try {
		while((bt = System.in.read()) != 'x'){
			System.out.print((char)bt);
		}
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
}
