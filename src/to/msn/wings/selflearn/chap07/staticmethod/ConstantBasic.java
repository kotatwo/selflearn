package to.msn.wings.selflearn.chap07.staticmethod;

public class ConstantBasic {

	public static void main(String[] args) {
		System.out.println(MyApp.BOOK_TITLE);
		//MyApp.BOOK_TITLE = "本気で覚えるJava";

	}

}
//まあfinal付いてんのにいじろうとしたらそりゃあエラー吐くわな...。
//定数はすべて大文字+単語の区切りにアンダースコア（スネークケース）でかくのぜ。