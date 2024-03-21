package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {

		// 자동 타입 변환 부분
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		System.out.println();
		
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3();
		
		child.field1 = "data3";
		
		child.method1();
		child.method2();

	}

}
