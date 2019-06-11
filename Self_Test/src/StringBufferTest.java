
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer strBf = new StringBuffer("가나다라마바사");
		
		System.out.println(strBf.indexOf("라"));
		System.out.println(strBf.append("아"));
		System.out.println(strBf.insert(1, "가멜"));
		System.out.println(strBf.delete(1, 3));
		System.out.println(strBf.replace(4, 8, "가나다라"));
		System.out.println(strBf.reverse());
		System.out.println(strBf.toString());
		
	}
}

/* 
int indexOf(매개 변수)
StringBuffer append(매개 변수)
StringBuffer insert(int offset, 매개 변수)
StringBuffer delete(int start, int end)
StringBuffer replace(int start, int end, String str)
StringBuffer reverse()
String toString()
*/