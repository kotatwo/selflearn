package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FolderProcess {

	public static void main(String[] args) throws IOException {
		var fs = FileSystems.getDefault();
		var dir1 = fs.getPath("C:/data/selflearn");
		var dir2 = fs.getPath("C:/Windows");
		//フォルダー作成
		Files.createDirectories(dir1);
		//フォルダー存在する？
		System.out.println(Files.exists(dir1));
		//フォルダーか
		System.out.println(Files.isDirectory(dir1));
		
		
		var s = Files.list(dir2);
		s.filter( v -> v.getFileName().toString().endsWith(".log")).forEach(System.out::println);
		//フォルダーをコピー
		var dir3 = Files.copy(dir1, fs.getPath("C:/data/selflearn/test"),
				StandardCopyOption.REPLACE_EXISTING);
		//フォルダーを移動
		Files.move(dir3, fs.getPath("C:/data/selflearn/sub"),
				StandardCopyOption.REPLACE_EXISTING);
		//フォルダーを削除
		Files.delete(fs.getPath("C:/data/selflearn/sub"));
		//フォルダーが存在する場合にだけ削除
		Files.deleteIfExists(fs.getPath("C:/data/selflearn/sub"));
		s.close();
	}

}
