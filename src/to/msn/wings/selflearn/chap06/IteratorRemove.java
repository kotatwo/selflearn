package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;

public class IteratorRemove {

	public static void main(String[] args) {
		
		var data = new ArrayList<String>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		
		var ite = data.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
			ite.remove();
		}
		System.out.println(data);
	}

}
//ループしながら要素を排除する場合、イテレーターを使用しましょう。拡張forではエラーが出ます。