package to.msn.wings.selflearn.chap07.optional2;

import java.util.Map;
import java.util.Optional;

public class BookMap {
	//ISBNコード: 書名　の形式で書籍情報管理
	private Map<String, String> data;
	
	//引数mapで書籍情報を初期化
	public BookMap(Map<String, String> map) {
		this.data=map;
	}
	
	//ISBNコード（引数isbn）をキーに書名を取得
	public Optional<String> getTitleByIsbn(String isbn) {
		return Optional.ofNullable(this.data.get(isbn));
	}

}
//Optionalはnull安全のためのクラス。