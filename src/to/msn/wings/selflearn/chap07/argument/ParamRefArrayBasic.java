package to.msn.wings.selflearn.chap07.argument;

public class ParamRefArrayBasic {

	public static void main(String[] args) {
		var data = new int[] {2, 3, 4};
		var p = new ParamRefArray();
		System.out.println(p.update(data)[0]);
		System.out.println(data[0]);

	}

}
//配列そのものを置き換えた場合は参照元も変わるため実引数に影響はない