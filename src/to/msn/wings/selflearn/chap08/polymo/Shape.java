package to.msn.wings.selflearn.chap08.polymo;

public abstract class Shape {
	protected double width;
	protected double height;
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//図形の面積を取得（派生クラスでオーバーライドするので、中身はダミー）
	public abstract double getArea(); 

}
//抽象メソッドは空のメソッド、そのメソッドをもつクラスのことを抽象クラスという。
//なお抽象クラスを継承した場合、必ずすべての抽象メソッドをオーバーロードする義務を負う。
//抽象メソッドにはブロック{}すら置くことを許されない。