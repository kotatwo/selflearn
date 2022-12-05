package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegMulti {

	public static void main(String[] args) {
		var str = "10人のインディアン。\n1年生になったら";
		var ptn = Pattern.compile("^\\d*"/*, Pattern.MULTILINE*/);
		var match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
//var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);とすることで「^」の意味が先頭から行頭に変わり、
//改行の直後にある1にもマッチするようになるとのこと。
//ちなみにオプションは Pattern.MULTILINE | Patter.CASE_INSENSITIVE みたいに「|」を使えば複数指定できる。