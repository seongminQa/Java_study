package ch15.sec02.exam03;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i=1; i<=10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println(endTime-startTime + " ns");
		
		
		long startTime2;
		long endTime2;
		
		startTime2 = System.nanoTime();
		
		for(int i=1; i<=10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime2 = System.nanoTime();
		
		System.out.println(endTime2-startTime2 + " ns");
		
	}

}
