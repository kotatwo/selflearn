package to.msn.wings.selflearn.chap05;

public class StrSubstring {

	public static void main(String[] args) {
		var str = "WINGSプロジェクト";
		System.out.println(str.substring(5,7));//５文字飛ばして2文字読む
		System.out.println(str.substring(5,2));//endよりbeginが大きいのは致命的
		System.out.println(str.substring(-5));//マイナス入れんな×すぞ
		System.out.println(str.substring(15));//開始位置15!?何かの間違いだるぉ！？

	}

}
