package to.msn.wings.selflearn.chap07.argument;

public class ArgsParams {

	public int totalProducts(int... values) {
		var result = 1;
		for(var value : values) {
			result *= value;
		}
	
		return result;
	}

}
//values[n]で特定の引数をとってこれる