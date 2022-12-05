package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollUnmodify {

	public static void main(String[] args) {
		var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
		var udata = Collections.unmodifiableList(data);
		udata.set(0, "チューリップ");
		udata.add("桜ふぶーきのお！");

	}

}
//unmodifiableList(data)にすることで値の変更を防ぐ。
