package practice.march;

public class One {

	public static void main(String[] args) {

		
		// 확인문제 7번
		int[] array = {1,5,3,8,2};
		int max = 0;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			} else {
				continue;
			}
		}
		
		System.out.println("array의 최댓값은 : " + max);
		
		
		// 확인문제 8번
		int[][] array2 = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
		};
		
		int totalSum = 0;
		int count = 0;
		
		for(int i=0; i<array2.length; i++) {
			count += array2[i].length;
			for(int j=0; j<array2[i].length; j++) {
				totalSum += array2[i][j];
			}
		}
		double totalAvg = (double) totalSum / count;
		System.out.println("전체 합 : " + totalSum);
		System.out.println("전체 평균 : " + totalAvg);
		
	}

}
