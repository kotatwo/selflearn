package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;

public class IteratorList {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
			add("バラ");
			add("ひまわり");
			add("あさがお");
			add("さぶたれいにあんろーず");
		}
	};
		var ite = data.listIterator(data.size());//data.size()で長さがわかるそしてその長さを引数（位置）として末尾に移動する。
		while(ite.hasPrevious()) {
			System.out.println(ite.previous());
		}
	}

}
//ite.hasPrevious 前の要素が存在するか。
//ite.previous 前の要素に移動する。
//これでリストを逆順に出力できる。