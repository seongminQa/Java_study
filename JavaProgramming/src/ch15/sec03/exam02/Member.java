package ch15.sec03.exam02;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode  // 롬복은 클래스의 필드 값이 서로 같으면 같은 HashCode와 equals 값을 리턴
public class Member {
	public String name;
	public int age;
}
