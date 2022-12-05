package to.msn.wings.selflearn.chap08.hiding;

import java.time.LocalDateTime;

public class BusinessPerson extends Person{
	//基底クラスのフィールドを隠蔽
	public LocalDateTime birth = LocalDateTime.now();
	
	public void show() {
		System.out.println(super.birth);
	}

}
//super.birthは基底クラスの隠蔽されたbirthフィールドを指す。
//superで隠蔽されたフィールドを呼び出せる。