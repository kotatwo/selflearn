package to.msn.wings.selflearn.chap09.tostring;

public class ToStringBasic {

	public static void main(String[] args) {
		var p = new Person("太郎", "山田");
		System.out.println(p);
	}

}
//printlnメソッドにオブジェクトを渡すと自動的にtoStringメソッドが呼び出される。