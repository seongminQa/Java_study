package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {

		// System.arraycopy(원본배열,원본배열시작인덱스,새로운배열,새로운배열붙여넣기시작인덱스,복사항목수)
		
		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		// 복사 메소드 사용!! for문 미사용
		System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
