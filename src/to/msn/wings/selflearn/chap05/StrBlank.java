package to.msn.wings.selflearn.chap05;

public class StrBlank {

	public static void main(String[] args) {
		var str1 = "";
		var str2 = " 　  ";
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		if(!str2.isEmpty()) {System.out.println("「!」で反転できたよ！やったね！");}

	}

}
//isBlankは空文字だけでなく空白にも反応する
//空白とは半角全角スペース、\t,\n,\r,\f,空白の文字列が含まれる