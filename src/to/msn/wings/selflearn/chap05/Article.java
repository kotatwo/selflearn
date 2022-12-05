package to.msn.wings.selflearn.chap05;

import java.io.Serializable;



	public class Article implements Serializable {
		private static final long serialVersionUID = 1L;
		public String title;
		public String url;
		public transient boolean expired;
		
		public Article(String title, String url, boolean expired) {
			this.title = title;
			this.url = url;
			this.expired = expired;
		}

	}
//呼び出される側だから実行するものではない。

