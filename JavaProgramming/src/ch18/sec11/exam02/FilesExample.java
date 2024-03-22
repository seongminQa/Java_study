package ch18.sec11.exam02;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FilesExample {

	public static void main(String[] args) throws IOException {
		
		// 텍스트 파일에 저장할 문자열
		String data = "" +
		"id: winter\n" + 
		"email: winter@mycompany.com\n" + 
		"tel: 010-123-1234";
		
		// Path 객체 생성
		Path path = Paths.get("C:/Temp/user.txt");
		
		// 파일 생성 및 데이터 저장
		Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
		
		// 파일 정보 얻기
		System.out.println("파일 유형: " + Files.probeContentType(path));
		System.out.println("파일 크기: " + Files.size(path) + " bytes");
		
		// 파일 읽기
		String content = Files.readString(path, Charset.forName("UTF-8"));
		System.out.println(content);
	}

}
