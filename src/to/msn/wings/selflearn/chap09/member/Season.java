package to.msn.wings.selflearn.chap09.member;

public enum Season {
	SPRING(0, "春"){
		@Override
		public void show() {
			System.out.println("春はあけぼの");
		}
	},
	SUMMER(1, "夏"){
		@Override
		public void show() {
			System.out.println("夏は夜");
		}
	},
	AUTUMN(2, "秋"){
		@Override
		public void show() {
			System.out.println("秋は夕暮れ");
		}
	},
	WINTER(3, "冬"){
		@Override
		public void show() {
			System.out.println("冬はつとめて");
		}
	};
	
	//フィールド宣言
	private int code;
	private String jpName;
	
	//コンストラクター
	private Season(int code, String jpName) {
		this.code = code;
		this.jpName = jpName;
	}
	
	//メソッド
	public int toSeasonValue() {
		return this.code;
	}
	
	@Override
	public String toString() {
		return this.jpName;
	}
	
	public abstract void show();//列挙定数で実装すべき機能を抽象メソッドとして準備し、列挙定数ブロックでオーバーライドするところまでテンプレ。

}
