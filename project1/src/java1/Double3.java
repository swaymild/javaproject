//0403 index5~14, Switch1~2, Double1~3
package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		
		/*
		 응용문제7.
		 사용자가 숫자 3개를 입력시킵니다.
		 3개의 숫자 중 짝수만 곱하여 결과값을 출력합니다.
		 단,짝수의 숫자가 1개 또는 없을 경우
		 "짝수의 숫자가 확인되지 않습니다."라고 출력 
		 */
		
		Scanner no = new Scanner(System.in);
	int a=1;
	int sum = 1;
	int count = 0;
		while(a <= 3) {
			System.out.println("숫자 3개를 입력하세요");
			int b = no.nextInt();
			if(b % 2 == 0) {
				sum *= b;
				count++;
			}
			a++;
		}
		
		if(count < 2) {
			System.out.println("짝수의 숫자가 확인되지 않습니다");
		}
		else {
			System.out.println(sum);
		}
		no.close();
	}

}
