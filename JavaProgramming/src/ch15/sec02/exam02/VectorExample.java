package ch15.sec02.exam02;

import java.util.*;

import ch15.sec02.exam01.Board;

public class VectorExample {
	public static void main(String[] args) {	
//		List<Board> list = new ArrayList<>();  // ArrayList는 동기화 처리가 안됨
		List<Board> list = new Vector<>();
		
		// 익명 객체 기법 사용
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board(i,"제목","내용","글쓴이",new Date()));
				}
			}
		};
		// 익명 객체 기법 사용
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board(i,"제목","내용","글쓴이",new Date()));
				}
			}
		};
		threadA.start();
		threadB.start();
		
		// main 스레드를 threadA와 threadB가 종료될 때까지 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
	}
}
