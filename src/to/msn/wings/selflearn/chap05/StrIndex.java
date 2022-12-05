package to.msn.wings.selflearn.chap05;

public class StrIndex {

	public static void main(String[] args) {
				// 0 1 2 3 4 5 6 7 8 9101112
		var str = "にわにはにわにわとりがいる";
		System.out.println(str.indexOf("にわ"));
		System.out.println(str.indexOf("にも"));
		System.out.println(str.lastIndexOf("にわ"));
		System.out.println(str.indexOf("にわ",3));
		System.out.println(str.lastIndexOf("にわ",3));

	}

}
//indexOfは引数と一致する位置をその文字列の先頭から順に検索してその位置の値を返す　見つからないなら-1を返す。
//0からスタートする。
//lastIndexOfは後ろからやる
//二つ目の引数には開始位置をいれる。