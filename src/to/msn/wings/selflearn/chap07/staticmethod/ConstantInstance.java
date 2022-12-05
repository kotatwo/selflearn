package to.msn.wings.selflearn.chap07.staticmethod;

public class ConstantInstance {

	public static void main(String[] args) {
		var app1 = new MyApp2("独習Java");
		System.out.println(app1.APP_NAME);
		var app2 = new MyApp2("Teach Yourself Java");
		System.out.println(app2.APP_NAME);
		System.out.println(Initializer.DOG);

	}

}
