package to.msn.wings.selflearn.chap07.scope;

public class ScopeBasic {

	public static void main(String[] args) {
		var s = new Scope();
		var t = new ScopeStrict();
		System.out.println(s.show());
		System.out.println(s.data);
		t.show();

	}

}
