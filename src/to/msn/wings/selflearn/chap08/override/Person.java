package to.msn.wings.selflearn.chap08.override;

public class Person {
	public String name;
	public int age;
	
	public String show() {
		return String.format("%s(%d歳)です。", this.name, this.age );
	}

}
//隠蔽: 基底クラスの同盟のフィールドを派生クラスで定義すると基底のは見えなくなる。これが隠蔽。
//意図して使うものではない。あくまでそういう仕様だと知っておく。