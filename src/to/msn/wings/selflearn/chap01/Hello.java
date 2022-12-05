package to.msn.wings.selflearn.chap01;

/* java.timeの下にあるもの全部インポート
 しかし処理が重くなるので不要ならしない。*/
import java.time.LocalDateTime;

public class Hello {

	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		

	}

}
