import java.util.*;

public class StringTokenizer_Test {
	public static void main(String[] args) {
		String line;
		String temStr = "hong 용산구 10.5 20.5";
		StringTokenizer parse= new StringTokenizer(temStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken();
		address = parse.nextToken();
		//math = Double.valueOf(parse.nextToken()).doubleValue();
		math = Double.parseDouble(parse.nextToken());
		//english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
		//String.split()
		String[] arrStr = temStr.split(" ");
		for (String str : arrStr) {
			System.out.print(str + "\t");
		}System.out.println();
		
		StringTokenizer st= new StringTokenizer("happy java", "a");
		String f = st.nextToken();
		String s = st.nextToken();
		String t = st.nextToken();
	
		System.out.println(f + " " + s + " " + t);
		
	}
}
