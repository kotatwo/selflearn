package to.msn.wings.selflearn.chap08.nginherit;

public final class BusinessPerson extends Person{
	public String intro() {
		return "会社員です";
	}

}
//finalを付けることでオーバーライド、継承を防ぐ