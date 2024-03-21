package ch12.sec05.exam01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {

		String data = "자바";

		// String -> Byte 배열 변환
		byte[] arr1 = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(arr1));

		// byte 배열 -> String
		String str1 = new String(arr1);
		System.out.println(str1);

		// String -> Byte 배열 변환
		try {
			byte[] arr2 = data.getBytes("UTF-8");
			System.out.println("arr2: " + Arrays.toString(arr2));

			// byte 배열 -> String
			String str2 = new String(arr2, "UTF-8");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
