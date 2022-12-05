package to.msn.wings.selflearn.chap09;

import java.util.regex.Pattern;

public class EnumBit2 {

	public static void main(String[] args) {
		
		var flags = Pattern.CASE_INSENSITIVE | Pattern.MULTILINE;
		// CASE_INSENSITIVE / MULTILINEを含んでいるか
		if((flags & (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) == 
			(Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) {
			 System.out.println("CASE_INSENTIVE／MULTILINEを含んでいる。");
		}
		if ((flags | (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) == (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) {
		      System.out.println("CASE_INSENTIVE／MULTILINEだけを含んでいる。");
		    }
	}

}
