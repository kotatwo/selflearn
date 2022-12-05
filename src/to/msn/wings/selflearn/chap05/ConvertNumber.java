package to.msn.wings.selflearn.chap05;

public class ConvertNumber {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("108")); //整数を文字列へ
		System.out.println(Double.parseDouble("1.2345")); //小数を文字列へ
		System.out.println(Integer.parseInt("FF", 16)); //16進数の文字列FFを10進数の整数へ
		System.out.println(Double.parseDouble("0.653e2"));//ん？なにこれ？まあいいや
	}

}
