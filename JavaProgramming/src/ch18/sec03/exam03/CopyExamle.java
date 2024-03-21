package ch18.sec03.exam03;

import java.io.*;

public class CopyExamle {

	public static void main(String[] args) throws IOException {
		String originalFileName = "C:/temp/test.jpg";
		String targetFileName = "C:/temp/test2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];	// byte는 메모리를 얼만큼 잡고 실행할 것인가 생각하고 준다.
		
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
		}
		
		os.flush();
		os.close();
		is.close();
		
	}

}
