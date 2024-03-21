package ch15.sec03.exam04;

import java.util.*;

public class IteratorRemoveExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		/*for(int i=0; i<list.size(); i++) {
			String item = list.get(i);
			if(item.equals("C")) {
				list.remove(item);
			}
		}
		System.out.println("총 객체 수: " + list.size());
		System.out.println();*/
		
		//
		/*for(String element : list) {
			System.out.println(element);
			if(element.equals("A")) {	// 처음 list의 객체 수는  4였는데, 맨 끝이 아닌 인덱스의 값을 지우면 인덱스 에러가 난다.
				list.remove(element);
			}
		}
		System.out.println("총 객체 수: " + list.size());
		System.out.println();*/
		
		// 이런 예외를 해결하기 위해 while문을 사용하자
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			
			if(element.equals("A")) {
				iterator.remove();
			}
			
			System.out.println(element);
		}
		
	}

}
