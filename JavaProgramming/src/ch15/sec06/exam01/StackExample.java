package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin> coinbox = new Stack<>();
		
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(40));
		coinbox.push(new Coin(150));
		coinbox.push(new Coin(420));
		
		while(!coinbox.isEmpty()){
			Coin coin = coinbox.pop();
			System.out.println(coin.getValue());
		}
		
	}

}
