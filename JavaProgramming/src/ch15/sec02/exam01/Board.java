package ch15.sec02.exam01;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

// 한 게시물에 대한 정보를 가지고 있는 객체
@Data
@AllArgsConstructor
public class Board {
	private int bno;
	private String subject;
	private String content;
	private String writer;
	private Date date;
	
}
