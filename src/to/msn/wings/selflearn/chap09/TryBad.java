package to.msn.wings.selflearn.chap09;

public class TryBad {

	public static void main(String[] args) {
		var data = new String[] {"Java", "C#", "Python"};
		try {
			var i = 0;
			//無限ループ（指定のインデックスが範囲外になったところで例外=終了）
			while(true) {
				System.out.println(data[i++]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {}

	}

}
//例外処理は低速だし分かりづらくなるんで普通に拡張for文でやるべきですねえこれは...。