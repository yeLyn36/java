
public class StringMethod {
	public static void main(String[] args) {
		String str = " abcdefghijklmnopqrstuvwxyz ";

		System.out.println(str.length());
		System.out.println(str.charAt(11));
		System.out.println(str.equals(" abcdefghijklmnopqrstuvwxyz "));
		System.out.println(Boolean.valueOf("true").booleanValue());
		System.out.println(Short.valueOf("1"));
		System.out.println(Character.valueOf('c'));
		System.out.println(Integer.valueOf("10"));
		System.out.println(Long.valueOf("10000000"));
		System.out.println(str.trim());
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
		System.out.println(str.indexOf("z"));

	}
}

/*int length()
char charAt(int index)
boolean equals(String str)
String valueOf(매개 변수)
String trim()
String substring(int start)
String substring(int start, int end)
int indexOf(매개 변수)*/
