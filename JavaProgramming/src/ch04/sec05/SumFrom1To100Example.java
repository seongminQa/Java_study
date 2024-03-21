package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~"+ (i-1) + "의 합은 : " + sum);
		System.out.println("반복문을 빠져나온 i의 값은 : " + i);
		
	}

}
