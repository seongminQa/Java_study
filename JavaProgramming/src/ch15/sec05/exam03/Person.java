package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		int result = name.compareTo(o.name);
//		return -result; // 역순으로 출력 활용 가능
		return result;
	}
}
