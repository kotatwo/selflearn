package to.msn.wings.selflearn.chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		try (var in = new FileInputStream("C:/data/nothing.gif")){
			var data = -1;
		}catch(FileNotFoundException e){
			System.out.println("ファイルは影も形もなかった...。");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
