package to.msn.wings.selflearn.chap08.accessor;

public class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setAge(int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("年齢には整数で指定してください。");//これでエラー文設定
		}
		this.age = age;
	}
	
	public String show() {
		return String.format("%s(%d歳)です。", getName(), getAge());
	}

}
//メソッドを介してprivateな値を取り出す。そのメソッドのことをアクセサーメソッドという！
//値取得のためのメソッドをゲッターメソッド、値設定のためのメソッドをセッターメソッドという。
//private宣言のところ右クリックしてソートを選べばゲッターセッターを自動的に設定してくれるで！