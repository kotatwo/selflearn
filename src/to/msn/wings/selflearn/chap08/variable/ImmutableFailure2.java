/*
package to.msn.wings.selflearn.chap08.variable;

import java.sql.Date;

public class ImmutableFailure2 {

	public static void main(String[] args) {
		var p = new Person("山田太郎", 30, new Date());
		System.out.println(p.getBirth());
		var birth = p.getBirth();
		//ゲッター経由で取得したオブジェクトを更新
		birth.setDate(15);
		System.out.println(p.getBirth());

	}

}
*/