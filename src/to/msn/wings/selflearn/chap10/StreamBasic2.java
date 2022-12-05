package to.msn.wings.selflearn.chap10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamBasic2 {
	public static void main(String[] args) {
		//リスト
		var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));
		list.stream().forEach(System.out::println);
		System.out.println("------------------");
		
		//配列
		var data = new String[] {"バラ", "あさがお", "チューリップ"};
		Arrays.stream(data).forEach(System.out::println);
		System.out.println("------------------");
		
		//マップ
		var map = new HashMap<String, String>(
				Map.of("orange", "みかん", "apple", "りんご", "strawberry", "いちご"));
		map.entrySet().stream().forEach(System.out::println);
	}

}
