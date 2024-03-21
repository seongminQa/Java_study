package practice.february;

public class Three {

	public static void main(String[] args) {
		
		// 1) 피라미드 만들기
		int i, j, k;
		
		for(i=1; i<=5; i++) {	// 개행
			
			for(j=5-i; j>=1; j--) {
				System.out.print(" ");
			}
			
			for(k=1; k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			
			if(i==5) {
				System.out.print("\n");
			}
			else {
				System.out.println();
			}
		}
		
		// 2) 다이아몬드 만들기
		int q, w, e;
		
		for(q=4; q>=1; q--) {
			
			for(e=1; e<=5-q; e++) {
				System.out.print(" ");
			}
			
			for(w=(q*2)-1; w>=1; w--) {
				System.out.print("*");
			}
			
			if(q == 0) {
				System.out.print("");
			}
			else {
				System.out.println();
			}
		}
		
	}

}
