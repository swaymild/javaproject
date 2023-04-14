package java1;
//Scanner class 활용법

import java.util.Scanner;

public class index6 {

	public static void main(String[] args) {
		
		//숫자형태의 Scanner
		Scanner a = new Scanner(System.in);
		System.out.println("Q. 당신의 나이는?");
		int age = a.nextInt();
		System.out.printf("입력하신 나이는 %d",age);

		//문자형태의 Scanner
		Scanner b = new Scanner(System.in);
		System.out.println("\nQ. 당신의 성함은?");
		String name = b.next();
		System.out.printf("고객명 %S 입니다",name);

		//Scanner 종료
		a.close();
		b.close();
	}

}
