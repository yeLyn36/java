package kr.hs.emirim.program;

public class StringBuffer_Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" JAVA Program");
		StringBuffer sb2 = new StringBuffer(" Project ");
		StringBuffer str = null;
		StringBuffer str2 = null;
		str = sb.append(" Project ");
		str2 = sb.append(sb2);
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("--------------------");
		StringBuffer sb3 = new StringBuffer("Funny Java");
		StringBuffer sb4 = null;
		sb4 = sb3.replace(0, 5, "Happy");
		System.out.println("sb3 = " + sb3);
		System.out.println("sb4 = " + sb4);
		System.out.println("--------------------");
		StringBuffer sb5 = sb4.reverse();
		System.out.println("sb5 = " + sb4);
		System.out.println("--------------------");
		String sb6 = sb5.toString().toUpperCase();
		System.out.println("sb6 = " + sb6);
		//String -> StringBuffer
		//new StringBuffer(String)
		//StringBuffer -> String
		//.toString()
		System.out.println("--------------------");
	}
}
