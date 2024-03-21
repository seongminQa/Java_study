package practice.march.classpractice;

public class OrderExample {

	public static void main(String[] args) {

		// 객체를 생성하고, 기본 생성자를 이용하여 first 객체 생성
		Order first = new Order();
		
		
		// 객체를 생성하고, 생성자에 매개값을 넘겨 Order(String topping)생성자를 이용하여 second 객체를 완성
		Order second = new Order("피자");
		
		System.out.println("첫 번째 고객님의 주문: " + first.shape + "모양 붕어빵 " 
				+ "토핑: " + first.topping);
		
		System.out.println("첫 번째 고객님의 주문: " + second.shape + "모양 붕어빵 " 
				+ "토핑: " + second.topping);

	}

}
