package to.msn.wings.selflearn.chap05;

public class StrCodePoint {

	public static void main(String[] args) {
		var str = "叱る";
		System.out.println(str.codePointCount(0, str.length()));
	}

}
//begin,endは省略不可能
//いうて.lengthでもそこまで誤差はない。