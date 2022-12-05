package to.msn.wings.selflearn.chap08.variable;

import java.util.Date;

public final class Person2 {
	private final String name;
	private final int age;
	private final Date birth;

	public Person2(String name, int age, Date birth) {
		this.name = name;
		this.age = age;
		this.birth = new Date(birth.getTime());
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Date getBirth() {
		return new Date(this.birth.getTime());
	}
}

//防御的コピー: 引数/戻り値の際に複製したオブジェクトを受け渡しすることです。
//これで呼び出し元の変更がクラスに影響することが無くなります。
