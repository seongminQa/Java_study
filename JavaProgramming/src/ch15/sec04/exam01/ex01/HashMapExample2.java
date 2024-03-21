package ch15.sec04.exam01.ex01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		// 컬렉션 생성
		Map<Member, Integer> map = new HashMap<>();
		
		// 엔트리 저장
		map.put(new Member("홍길동", 25), 85);  // 85는 Integer. int로 자동 언박싱이 일어남
		map.put(new Member("감자바", 26), 95);
		map.put(new Member("홍자바", 27), 74);
		map.put(new Member("홍길동", 25), 82);
		
		// 저장된 엔트리 수
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
	}

}
