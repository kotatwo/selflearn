package to.msn.wings.selflearn.chap05;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {

	public static void main(String[] args) {
		var num1 = 1234.5678;
		var nf1 = NumberFormat.getCurrencyInstance(Locale.JAPAN);//通貨フォーマット
		var nf2 = NumberFormat.getIntegerInstance();//整数
		var nf3 = NumberFormat.getNumberInstance();//汎用数値フォーマット
		System.out.println(nf1.format(num1));
		System.out.println(nf2.format(num1));
		System.out.println(nf3.format(num1));
		
		var num2 = 0.567;
		var nf4 = NumberFormat.getPercentInstance();//パーセント表記+四捨五入
		System.out.println(nf4.format(num2)); 

	}

}
