package to.msn.wings.selflearn.chap09.equals;

public class EqualsBasic {

	public static void main(String[] args) {
		var p = new Person("太郎", "山田");
		var bp = new BusinessPerson("太郎", "山田", "営業");
		System.out.println(p.equals(bp));
		System.out.println(bp.equals(p));

	}

}
