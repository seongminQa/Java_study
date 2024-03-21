package ch18.sec06;

import java.io.*;
import java.util.Scanner;

public class CharacterConvertStreamExample {
	
	public static void main(String[] args) throws IOException{
		
		
		Scanner scan = new Scanner(System.in);
		try {
//			write(scan.nextLine());
//			read();
			write("문자 변환 스트림을 사용합니다.");
			String data = read();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	


	// OutputStream을 Writer로 바꿔보자
	public static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("C:/temp/test01.txt.");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	};
	
	// InputStream을 Reader로 바꿔보자
	public static String read() throws IOException{
		InputStream is = new FileInputStream("C:/temp/test01.txt.");
		Reader reader = new InputStreamReader(is, "UTF-8");
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
		return str;
	};

}
