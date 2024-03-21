package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		// 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 엔트리 저장
		map.put("홍길동", 85);  // 85는 Integer. int로 자동 언박싱이 일어남
		map.put("감자바", 95);
		map.put("홍자바", 74);
		map.put("추자바", 82);
		map.put(new String("홍길동"), 90);
		
		// 저장된 엔트리 수
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// key로 값을 얻기
//		System.out.println(map.get("홍길동"));
		String key = "홍길동";
		int value = map.get(key);  // Integer타입이 int로 자동 언박싱이 일어남
		System.out.println(key + ":" + value);
		System.out.println();
		
		// 엔트리를 하나씩 가져와 키와 값을 출력
		for(Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		
		for(String k : map.keySet()) {
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		// 향상된 for문은 '삭제'작업시 문제가 될 수 있다.
		/*for(Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + ":" + v);
			map.remove(k);
		}
		System.out.println();*/
		
		// Iterator로 사용하기
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			if(k.equals("홍길동")) {
				iterator.remove();
			} else {
				System.out.println(k + ":" + v);				
			}
		}
	}

}
