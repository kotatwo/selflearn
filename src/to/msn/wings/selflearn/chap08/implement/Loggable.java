package to.msn.wings.selflearn.chap08.implement;

public interface Loggable {
	default void log(String msg) {
		System.out.println("Log: " + msg);
	}
}
//実装クラス(この場合ではLoggableImpl)に明示的に実装されない場合、defaultメソッドが規定で採用される。