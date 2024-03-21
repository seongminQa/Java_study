package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("src/ch18/sec07/exam01/BufferExample.java");
		BufferedReader br = new BufferedReader(reader);
		
		int lineNo = 1;
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(lineNo + "\t" + line);
			lineNo++;
		}
		br.close();
		
	}

}
