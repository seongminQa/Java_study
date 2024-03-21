package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// 컬렉션 객체 생성
		Set<Member> set = new HashSet<>();
		
		// 객체 저장
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		System.out.println(m1.hashCode() == m2.hashCode());
		System.out.println(m1.equals(m2));
		set.add(m1);
		set.add(m2);

		
		// 저장된 객체 수
		System.out.println("총 객체 수: " + set.size());
		
	}

}
