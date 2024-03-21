package ch15.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 객체 저장
		scores.add(87);
		scores.add(56);
		scores.add(86);
		scores.add(23);
		scores.add(66);
		scores.add(81);
		scores.add(96);
		
		// 하나씩 객체를 오름차순으로 가져오기
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// TreeSet이 가지고 있는 메소드
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 낮은 점수: " + scores.last());
		System.out.println("90점 바로 위의 점수: " + scores.lower(86));
		System.out.println("90점 바로 아래 점수: " + scores.higher(86));
		System.out.println("90이거나 바로 아래 점수: " + scores.floor(86));
		System.out.println("90이거나 바로 아래 점수: " + scores.ceiling(86));
		System.out.println();
		
		// 하나씩 객체를 오름차순으로 가져오기
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 하나씩 객체를 내림차순으로 가져오기
		for(int score : scores.descendingSet()) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 범위 검색(80 <= )
		for(int score : scores.tailSet(80, true)) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 범위 검색(80 <= score < 90)
		for(int score : scores.subSet(80, true, 90, false)) {
			System.out.print(score + " ");
		}
		
	}

}
