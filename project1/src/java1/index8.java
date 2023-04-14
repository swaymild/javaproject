package java1;

import java.util.Scanner;

public class index8 {
	//Scanner와 문자열 비교
	public static void main(String[] args) {
		
		//equals = "==" (같다)
		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String mid = a.next().intern();
		//intern() : 문자에 한해서 조건문에 equals 사용하지않고 연산자 기호로 처리할 때 사용 
		
		if(mid == "kim" || mid == "park") {
//		if(mid.equals("kim") || mid.equals("park")) {
			System.out.println("회원이 확인되었습니다");
		}
		else {
			System.out.println("비회원입니다");
		}
		
		/*
		 응용문제1.
		 사용자가 원하는 숫자를 입력합니다.
		 단,해당 숫자가 100이하 숫자만 입력해야하며
		 100초과일 경우 "숫자는 100까지만 입력가능합니다"라는 메세지가
		 출력되도록 제작하시오.
		 추가.사용자가 입력한 값이 짝수인지 홀수인지 출력하시오.
		 */
		
		Scanner b = new Scanner(System.in);
		System.out.println("원하시는 숫자를 입력하세요");
		int no = b.nextInt();
		if(no > 100) {
			System.out.println("숫자는 100까지만 입력가능합니다");
		}
		else {
			if(no % 2 == 0) {
			System.out.printf("입력하신 숫자 : %d , 짝수",no);
			}
			else {
			System.out.printf("입력하신 숫자 : %d , 홀수",no);
			}
		}
		a.close();
		b.close();
		
	}

}
