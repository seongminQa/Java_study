package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) {

			try {
				OutputStream os = new FileOutputStream("C:/temp/test2.db");
				byte[] array = { 10, 20, 30 };
				
				os.write(array);
				
				os.flush();
				os.close();
				
			} catch (IOException e) {
			}
			
			

	}

}
