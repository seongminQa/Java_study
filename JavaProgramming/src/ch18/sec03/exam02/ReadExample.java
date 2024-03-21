package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) {
					break;
				}
				System.out.println(num);
			}
			
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
