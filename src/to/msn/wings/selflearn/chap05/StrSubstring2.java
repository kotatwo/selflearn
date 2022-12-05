package to.msn.wings.selflearn.chap05;

public class StrSubstring2 {

	public static void main(String[] args) {
		var mail = "yamada@example.com";
		System.out.println(mail.substring(mail.lastIndexOf("@")+1));

	}

}
//IndexOfで@の位置を取得して、そこから@より後ろを読み込む