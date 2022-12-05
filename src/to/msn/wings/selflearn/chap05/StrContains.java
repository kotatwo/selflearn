package to.msn.wings.selflearn.chap05;

public class StrContains {

	public static void main(String[] args) {
		var str="WINGSプロジェクト";
		
		System.out.println(str.contains("プロ"));//プロは含まれてる？
		System.out.println(str.startsWith("WINGS"));//WINGSから始まってる？
		System.out.println(str.startsWith("WINGS", 3));//三文字読み飛ばすためfalseになる。
		System.out.println(str.endsWith("WINGS"));//WINGSで終わってる？
		

	}

}
