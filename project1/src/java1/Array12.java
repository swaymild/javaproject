//0405 Array1~12, Class_array1~2(Data1,Scoring) 
package java1;

import java.util.Arrays;

public class Array12 {

	public static void main(String[] args) {

		/*
		 응용문제9.
		 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오.
		 단,해당 배열은 2차 배열 형태입니다.
		 
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 최종결과값 : 90
		 */
		
		int no[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int sum = 0;
		int node = 0;
		
		for(int[] a:no) {
			for(int b:no[node]) {
				if(b % 2 == 0) {
					sum += b;
				}
			}
			node++;
			System.out.println(Arrays.toString(a));
		}
		System.out.printf("짝수값의 총합 : %d",sum);
		
	}

}
