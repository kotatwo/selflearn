package to.msn.wings.selflearn.chap05;

public class StrStrip {

	public static void main(String[] args) {
		var str = "  Wings Project  ";
		System.out.println(str.strip()); //前後の空白消去
		System.out.println(str.stripLeading()); //前の空白消去
		System.out.println(str.stripTrailing()); //後ろの空白消去

	}

}
