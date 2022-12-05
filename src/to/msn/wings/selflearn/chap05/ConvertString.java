package to.msn.wings.selflearn.chap05;

public class ConvertString {

	public static void main(String[] args) {
		System.out.println(String.valueOf(108));//文字列を整数へ
		System.out.println(Integer.toString(108));//整数を文字列へ
		System.out.println(Double.toString(1.2345));//小数を文字列へ
		System.out.println(Integer.toString(255,16));//10進数の整数を16進数の文字列へ
		System.out.println(Integer.toHexString(255));//10進数の整数を16進数の文字列へ
	}

}
