package ch18.sec07.exam01;

import java.io.*;

// 복사 프로그램, 버퍼로 사용했을 때 얼마나 향상될까?
public class BufferExample {

	public static void main(String[] args) throws IOException {
		
		// 원본 파일과 대상 파일의 경로
		String originalFilePath1 = "D:\\KosaCourse\\projects\\JavaProgramming\\src\\ch18\\sec07\\exam01\\originalFile1.jpg";
		String targetFilePath1 = "C:/temp/targetFile1.jpg";
		
		String originalFilePath2 = BufferExample.class.getResource("originalFile1.jpg").getPath(); // 메소드 영역에 저장된 파일의 번지
		String targetFilePath2 = "C:/temp/targetFile2.jpg";
		
		// 버퍼를 사용하지 않는 입출력 스트림
		InputStream is1 = new FileInputStream(originalFilePath1);
		OutputStream os1 = new FileOutputStream(targetFilePath1);
		
		// 버퍼를 사용하는 입출력 스트림
		InputStream is2 = new FileInputStream(originalFilePath2);
		OutputStream os2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		
		// 복사시간 비교하기
		long nonBufferTime = copy(is1, os1);
		System.out.println(nonBufferTime + " ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println(bufferTime + " ns");
		
		// 스트림 닫기
		is1.close();
		os1.close();
		bis.close();
		bos.close();
		
		
	}
	
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}

}
