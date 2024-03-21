package ch07.sec09;

public class InstanceofExample {

	// main 메소드에서 바로 호출하기 위해 정적 메소드 선언
	// Person객체 또는 Person의 자식 객체를 매개변수로 입력받아야 동작
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		//person.study(); // 실행 안됨 가능하게하려면?
		
		/*if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}*/
		
		// 자바 12부터 가능
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}
	
	

	public static void main(String[] args) {
		
		personInfo(new Person("홍길동"));
		personInfo(new Student("감자바", 100));
	}

}
