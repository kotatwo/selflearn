package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;

public class CollForeach {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		for(var s : data) {//拡張for文
			System.out.println(s);
			//data.remove(s);　これ入れるとエラーになる。ループ削除の処理はiteratorを使い、while構文でしよう。
		}
	}

}
