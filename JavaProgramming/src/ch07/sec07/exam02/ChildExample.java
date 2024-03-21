package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {

		// 자식 객체를 생성
		Child child = new Child();
		
		child.method1();	// 상속받은 메소드 실행
		child.method2();
		child.method3();
		
		System.out.println();
		
		// 자동 타입 변환!
		Parent parent = child;
		
		// 메소드 호출 확인해보기
		parent.method1();
		parent.method2();	// 재정의한 것이 실행됨
		
//		parent.method3();  // 호출 불가능 // Parent 타입(클래스)에는 method3()이 정의되어 있지 않기 때문이다. 
		// 재정의 된 것이 있으면 무조건 재정의 된 것이 실행
		// 
		
		if(child == parent) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
		
	}

}
