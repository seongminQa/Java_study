package ch11.sec05;

import java.io.*;

public class ThrowsExample2 {

	public static void main(String[] args) {

	}

	// 사용하는 쪽에서 다양하게 예외 처리가 가능하다.
	public static void method1() {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 사용하는 쪽에서 다양하게 예외 처리가 가능하다.
	public static void method2() {
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 내가 메소드를 만들 경우, 사용자가 예외 처리를 해주어야한다.
	public static void method() throws IOException, FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/Temp/a.txt");
		fis.read();
		fis.close();
	}

}
