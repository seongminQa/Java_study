package checkproblem.my.problem2567.copy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	      
	      int[][] arry = new int[100][100];
	      int sum1=0;
	      int sum2=0;
	      
	      // 사각형 갯수 입력받기
	      int num = scan.nextInt();
	      
	      // 개수만큼 반복
	      for(int n=0; n<num; n++) {
	         
	         // 사각형의 좌표 입력받기
	         int row = scan.nextInt();
	         int col = scan.nextInt();
	         
	         // 사각형 1채워 넣기
	         for(int i=row; i<row+10; i++) {
	            for(int j=col; j<col+10; j++) {
	               arry[i][j] = 1;
	            }
	         }
	      }
	      
	      for(int i=89; i<100; i++) {
	         for(int j=89; j<100; j++) {
	            System.out.print(arry[i][j]+ " ");
	         }
	         System.out.println();
	      }
	      
	      // 세로 축의 값이 변할 때 + 가로 축의 값이 변할 때를 기점으로 변을 1로 인식하여 합하기
	      for(int i=0; i<100; i++) {
	         for(int j=0; j<100; j++) {
	            
	            // 좌표가 0->1 또는 1->0으로 변하지 못할 때의 대응
	            if(arry[i][j]==1 && (i==0 || i==99)) {
	               sum1 += 1;
	            }
	            if(arry[i][j]==1 && (j==0 || j==99)) {
	               sum1 += 1;
	            }

	         }
	      }
	      
	      /*for(int i=0; i<99; i++) {
	         for(int j=0; j<99; j++) {
	            
	            // 좌,우가 0->1로 또는 1->0으로 변할 때
	            // i,j의 최대 한계치는 98
	            if((arry[i][j]==0 && arry[i][j+1]==1) || 
	                  (arry[i][j]==1 && arry[i][j+1]==0)) {
	               sum2 += 1;
	            } 
	            
	            // 상,하가 0->1로 또는 1->0으로 변할 때
	            if((arry[j][i]==0 && arry[j+1][i]==1) || 
	                  (arry[j][i]==1 && arry[j+1][i]==0)) {
	               sum2 += 1;
	            }
	         }
	      }*/
	      
	      for(int i=1; i<100; i++) {
	         for(int j=1; j<100; j++) {
	            
	            // 좌,우가 0->1로 또는 1->0으로 변할 때
	            // i,j의 최대 한계치는 98
	            if((arry[i-1][j-1]==0 && arry[i-1][j]==1) || 
	                  (arry[i-1][j-1]==1 && arry[i-1][j]==0)) {
	               sum2 += 1;
	            } 
	            
	            // 상,하가 0->1로 또는 1->0으로 변할 때
	            if((arry[j-1][i-1]==0 && arry[j][i-1]==1) || 
	                  (arry[j-1][i-1]==1 && arry[j][i-1]==0)) {
	               sum2 += 1;
	            }
	         }
	      }
	      
	      System.out.println("sum1 : " + sum1);
	      System.out.println("sum2 : " + sum2);

	}

}
