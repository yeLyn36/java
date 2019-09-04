package kr.hs.emirim.program;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Wrapper_Test {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer (200);
		System.out.println("in == in2 -->" + (in == in2));
		System.out.println("in.equals(in2) -->" + in.equals(in2));
		System.out.println("in.equals(in3) -->" + in.equals(in3));
		System.out.println("------------------------------------");
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		System.out.println("------------------------------------");
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.456"));
		//parseInt() : String -> int
		//parseDouble() : String -> double
		System.out.println(Integer.parseInt("456"));
		System.out.println(Double.parseDouble("789.123"));
		
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue());
	
		ArrayList arr = new ArrayList();
				arr.add(new Integer(200));
		arr.add(100);
		for (Object o : arr) {
			System.out.println((int)o);
		}
	}
}
