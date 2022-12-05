package to.msn.wings.selflearn.chap07.scope;

public class ScopeBlock {

	public static void main(String[] args) {
		{
		//	var data = "ブロックスコープ";
		}
		
		{
		var data = "ブロックスコープ2";
		System.out.println(data);
		}
	}

}
