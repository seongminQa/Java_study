package ch15.sec03.exam03;

import java.util.*;

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
		
		// 하나씩 객체 가져오기 방법 1 // HashSet은 인덱스를 갖지 않음
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		// 하나씩 객체 가져오기 방법 2
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			String element = iterator.next();
			System.out.println(element);
			
			if(element.equals("JSP")) {
				// set에서 객체
				iterator.remove();
			}
		}
		System.out.println();
		
		for(String item : set) {
			System.out.println(item);
		}
		
	}

}
