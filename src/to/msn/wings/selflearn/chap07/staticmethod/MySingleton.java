package to.msn.wings.selflearn.chap07.staticmethod;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	
	private MySingleton() {}
	
	public static MySingleton getInstance() {
		return instance;
	}
 
}
//