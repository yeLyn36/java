package kr.hs.emirim.practice;

public class ClassPractice {
	public static void main(String[] args) {
		Entertainer �ڳ��� = new Entertainer();
		�ڳ���.name = "�ڳ���";
		�ڳ���.����_�ƴ�_���� = true;
		�ڳ���.�����();
		�ڳ���.interview();
		System.out.println();
		Actor ������ = new Actor();
		������.name = "������";
		������.����_�ƴ�_���� = false;
		������.�����();
		������.interview();
		������.movie = "�мǿ�";
		������.crying();
		������.���α�();
		Singer ���̽� = new Singer();
		���̽�.name = "���̽�";
		���̽�.����_�ƴ�_���� = true;
		���̽�.song = "�׋��� ���Ҿ�";
	}
}
