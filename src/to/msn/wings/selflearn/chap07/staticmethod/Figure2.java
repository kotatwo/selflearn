package to.msn.wings.selflearn.chap07.staticmethod;

public class Figure2 {
	public static double pi = 3.14;
	
	public static void getCircleArea(double r) {
		System.out.println("円の面積は" + r*r*pi);
	}
}
//static →インスタンス化せずとも呼び出せる
//private →インスタンス化できない。
//ユーティリティクラスとは関連した機能をまとめたクラスのこと
//ユーティリティクラスではfinal修飾子で継承させないのが一般的
