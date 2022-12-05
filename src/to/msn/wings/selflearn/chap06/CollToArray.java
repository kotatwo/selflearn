package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class CollToArray {

	public static void main(String[] args) {
		var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
		//リストと同じサイズの配列strsに中身をコピー
		var strs = new String[data.size()];
		data.toArray(strs);
		//値を変更して、配列/リストの内容を確認
		data.set(0, "チューリップ");
		System.out.println(Arrays.toString(strs));
		System.out.println(data);
	}

}
