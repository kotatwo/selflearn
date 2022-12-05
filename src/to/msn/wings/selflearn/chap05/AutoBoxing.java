package to.msn.wings.selflearn.chap05;

public class AutoBoxing {

	public static void main(String[] args) {
		Long result = 0L;//本当はlongにすべき所
		
		for(var i=1 ; i<10000; i++) {//１～１００００までの総和
			result += i;
		}
		System.out.println(result);

	}

}
