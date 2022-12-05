package to.msn.wings.selflearn.chap06;

import java.util.TreeMap;

public class MapTreeSort {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>(
				(x, y) -> x.length() - y.length()//これで昇順（小さい順）//降順（大きい順）にしたい場合はy.lengthとx.lengthを
				);								//入れ替えればよい
		data.put("Rose", "バラ");
		data.put("Sunflower", "ひまわり");
		data.put("Morning Glory", "あさがお");
		System.out.println(data);

	}

}
