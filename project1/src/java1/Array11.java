package java1;

import java.util.Arrays;

public class Array11 {

	//2차배열 응용편
	public static void main(String[] args) {
		
		/*
		 응용문제8.
		 Adata[0]과 Adata[1] 두가지 배열값을 더한 후
		 해당 배열값을 기준으로 짝수, 홀수인지 나열하는
		 배열 결과를 출력하는 코드를 작성하시오.
		 
		 Adata[0] = 5 17 19 22 33
		 Adata[1] = 1 2 3 4 5
		 result = ["짝수","홀수","짝수","짝수","짝수"]
		 */

		int Adata[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
//		String Bdata[] = new String[Adata[0].length];
//		int node = 0;
//		
//		for(int a:Adata[0]) {
//			a += Adata[1][node];
////			System.out.println(a);
//			if(a % 2 == 0) {
//				Bdata[node] = "짝수";
//			}
//			else {
//				Bdata[node] = "홀수";
//			}
//			node++;
//		}
//		System.out.println(Arrays.toString(Bdata));
		
		
		int ea = Adata[0].length;
		String result[] = new String[ea];
		
		int w = 0;
		while(w < ea) {
			int total = Adata[0][w] + Adata[1][w];
			if(total % 2 == 0) {
				result[w] = "짝수";			
			}
			else {
				result[w] = "홀수";
			}
			w++;
		}
		System.out.println(Arrays.toString(result));
		
		
	}

}
