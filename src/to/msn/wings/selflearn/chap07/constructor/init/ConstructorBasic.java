package to.msn.wings.selflearn.chap07.constructor.init;

import java.time.LocalDate;

public class ConstructorBasic {

	public static void main(String[] args) {
		Person A = new Person("孝太","染谷",LocalDate.of(2000, 8, 30));
		A.show();
	}

}
