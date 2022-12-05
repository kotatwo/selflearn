package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpPost {

	public static void main(String[] args) throws IOException, InterruptedException {
		var client = HttpClient.newHttpClient();
		var req = HttpRequest.newBuilder()
				.uri(URI.create("http://start-javaweb4.today/selflearn/someya/post.php"))
				.header("Content-Type","application/json")
				.POST(HttpRequest.BodyPublishers.ofString(
						"{ \"name\" : \"染谷孝太\" }"))
				.build();
		var res = client.send(req, HttpResponse.BodyHandlers.ofString());
		System.out.println(res.body());

	}

}
