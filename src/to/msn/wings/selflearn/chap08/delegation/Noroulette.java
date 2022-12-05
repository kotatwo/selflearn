package to.msn.wings.selflearn.chap08.delegation;

import java.util.Random;

public class Noroulette extends Random{
	//ルーレットの上限値
	private int bound;
	
	public Noroulette(int bound) {
		this.bound = bound;
	}
	
	
	//boundフィールドを上限とする値を取得
	@Override
	public int nextInt() {
		return nextInt(this.bound);
	}
	
	
	//他の不要なメソッドは無効化
	@Override
	public boolean nextBoolean() {
		throw new UnsupportedOperationException();
	}
	//ここから以下複数のnext######
	

}
//基底クラスの変数に、その派生型のインスタンスを代入しても、コードの妥当性が損なわれないという
//リスコフの置き換え原則に余裕で反するのでここで継承を使うのは妥当ではない
