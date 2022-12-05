package to.msn.wings.selflearn.chap08.variable;

import java.util.Date;

public class ImmutableFailure {
	public static void main(String[] args) {
		var birth = new Date();
		var p = new Person("山田太郎", 30, birth);
		System.out.println(p.getBirth());
		//インスタンス化に際して渡したオブジェクトを更新（日付を更新）
		birth.setDate(15);
		System.out.println(p.getBirth());

	}

}
