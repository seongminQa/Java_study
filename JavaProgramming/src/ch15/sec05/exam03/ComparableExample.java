package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("가길동", 25));
		treeSet.add(new Person("홍길동", 20));
		treeSet.add(new Person("나길동", 26));
		treeSet.add(new Person("바길동", 28));
		treeSet.add(new Person("다길동", 31));
		treeSet.add(new Person("차길동", 29));
		
		for(Person p : treeSet) {
			System.out.println(p.name);
		}
		
	}

}
