package to.msn.wings.selflearn.chap07.argument;

public class ParamRefArray {
	public int[] update(int[] data) {
		data = new int[] {10,20,30};
		return data;
	}

}
//配列そのものを置き換えた場合は参照元も変わるため実引数に影響はない