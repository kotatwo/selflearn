package to.msn.wings.selflearn.chap07.constructor.factory;

public class FactoryClass {
	private FactoryClass() {}
	
	public static FactoryClass getInstance() {
		return new FactoryClass();
	}
}
