package to.msn.wings.selflearn.chap09;

public class NestBasic {

	public static void main(String[] args) {
		var c = new MyClass();
		c.run();//そのクラスのメソッド経由なら普通に呼べる。
		
		//var h = new MyClass.MyHelper(); MyHelperはstaticメンバークラスだから
										//そのクラスからしか呼び出せない。

	}

}
