package kr.hs.emirim.practice;

public class ClassPractice {
	public static void main(String[] args) {
		Entertainer 박나래 = new Entertainer();
		박나래.name = "박나래";
		박나래.여자_아님_남자 = true;
		박나래.방송중();
		박나래.interview();
		System.out.println();
		Actor 안재현 = new Actor();
		안재현.name = "안재현";
		안재현.여자_아님_남자 = false;
		안재현.방송중();
		안재현.interview();
		안재현.movie = "패션왕";
		안재현.crying();
		안재현.개인기();
		Singer 케이시 = new Singer();
		케이시.name = "케이시";
		케이시.여자_아님_남자 = true;
		케이시.song = "그떄가 좋았어";
	}
}
