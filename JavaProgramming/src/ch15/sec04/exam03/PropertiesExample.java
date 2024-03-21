package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		// Properties 컬렉션 생성
		Properties prop = new Properties();

		// 이 파일과 동일한 ClassPath에 있는 database.properties 파일 로드
		try {
			prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
		}
		
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(userName + ":" + password);
	}
}
