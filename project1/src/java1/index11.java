package java1;

import java.util.Scanner;

public class index11 {

	//while문, do~while문
	public static void main(String[] args) {
		
		//while문
		int a = 1;
		while(a<=9) {
//			System.out.println(a);
			a++;
		}
		
		//do~while문
		int b = 1;
		do {
//			System.out.println(b);
			b++;
		}while(b<=9);

		/*
		 응용문제3.
		 사용자가 2개의 숫자를 입력합니다.
		 두 숫자의 범위에 있는 모든 값을 더하는 코드를 작성하시오.
		 예시) 10 15
		 10+11+12+13+14+15 : 결과값 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("합산할 두 숫자의 범위를 입력하세요");
		int c = sc.nextInt();
		int no = c;
		int d = sc.nextInt();
		int sum = 0;
		sc.close();
		while(c<=d) {
			sum+=c;
			c++;
		}
		System.out.printf("%d에서 %d까지의 총합 : %d",no,d,sum);
		
	}

}
