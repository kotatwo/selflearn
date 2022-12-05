package to.msn.wings.selflearn.chap05;

public class StrCharAt {

	public static void main(String[] args) {
		var str ="叱る";
		System.out.println((int) str.charAt(0));

	}

}
//mail.charAtは一文字単位で抜き出す。FORと併用しよう。
//この場合はサロゲート値を返してしまう