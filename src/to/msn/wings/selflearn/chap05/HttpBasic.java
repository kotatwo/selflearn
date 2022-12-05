package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpBasic {

	public static void main(String[] args) throws IOException, InterruptedException {
		//HTTPクライアントを作成
		var client = HttpClient.newHttpClient();
		//リクエストを準備
		var req = HttpRequest.newBuilder()
				.uri(URI.create("https://codezine.jp/"))
				.build();
		//レスポンスを取得
		var res = client.send(req, HttpResponse.BodyHandlers.ofString());
		//取得したコンテンツを出力
		System.out.println(res.body());

	}

}
