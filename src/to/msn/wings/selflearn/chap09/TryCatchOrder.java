/*package to.msn.wings.selflearn.chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchOrder {

	public static void main(String[] args) {
		try(var in = new FileInputStream("C:/data/nothing.gif")){
			
		}catch(Exception e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}*/
//Exceptionは一番下でやれ！！
