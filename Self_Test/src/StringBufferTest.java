
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer strBf = new StringBuffer("�����ٶ󸶹ٻ�");
		
		System.out.println(strBf.indexOf("��"));
		System.out.println(strBf.append("��"));
		System.out.println(strBf.insert(1, "����"));
		System.out.println(strBf.delete(1, 3));
		System.out.println(strBf.replace(4, 8, "�����ٶ�"));
		System.out.println(strBf.reverse());
		System.out.println(strBf.toString());
		
	}
}

/* 
int indexOf(�Ű� ����)
StringBuffer append(�Ű� ����)
StringBuffer insert(int offset, �Ű� ����)
StringBuffer delete(int start, int end)
StringBuffer replace(int start, int end, String str)
StringBuffer reverse()
String toString()
*/