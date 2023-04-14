package java1;

import java.util.Scanner;

public class index10 {

	//for문 + Scanner
	public static void main(String[] args) {
		
		/*
		 응용문제2.
		 원하는 구구단 숫자를 입력하세요.
		 사용자가 원하는 숫자를 입력하면 해당 숫자에 맞는
		 구구단이 출력되도록 하시오
		 예시)3입력시 3*1=3 >> 3*9=27 출력
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.println("계산할 구구단 숫자를 입력하세요");
		int no = a.nextInt();
		int no2;
		a.close();
		
		for(no2=1;no2<=9;no2++) {
			System.out.printf("\n%d * %d = %d",no,no2,no*no2);
		}

	}

}
