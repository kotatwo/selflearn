package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegSingle {

	public static void main(String[] args) {
		var str = "はじめまして。\nよろしくお願いします。";
		var ptn = Pattern.compile("^.+"/*, Pattern.DOTALL*/);
		var match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
//var ptn = Pattern.compile("^.+", Pattern.DOTALL);とすると任意の１文字を表す「.」に改行文字も含まれるようになるらしい。
//もともと「.」の任意の１文字の中に改行文字は含まないらしいで。
