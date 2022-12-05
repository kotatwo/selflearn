package to.msn.wings.selflearn.chap07.staticmethod;

public class StaticBasic {

	public static void main(String[] args) {
		System.out.println(Figure.getTriangleArea(10, 20));

	}

}
//インスタンス経由で Figure f = new Figure()
//System.out.println(f.getTriangleArea(10, 20));としても機能するぜ
//ただ絶対的非推奨だからやめときな！死ぬぜ....俺が。