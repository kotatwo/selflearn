package to.msn.wings.selflearn.chap06;

import java.util.IdentityHashMap;

public class MapHashIdentity {

	public static void main(String[] args) {
		var key1 = Integer.valueOf(256);
		var key2 = Integer.valueOf(256);
		
		var data = new IdentityHashMap<Integer, String>(){
			{
				put(key1, "hoge");
				put(key2, "Foo");
			}
		};
		System.out.println(data);

	}

}
//HashMapでは同じキーを持つせいで同じものとみなされて上書きされ、{256=Foo}のみしか表示されないが、
//IdentityHashMapにすればオブジェクトで別物とみなしてくれるため、{256=hoge, 256=Foo}と表示してくれる。