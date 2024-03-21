package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// 컬렉션 객체 생성
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add(new String("Java")); // HashSet은 HashCode()를 재정의했다. 같은 문자열일 경우 해시코드도 같다.
		set.add("Spring");
		
		// 저장된 객체 수
		System.out.println("총 객체 수: " + set.size());
		
	}

}
