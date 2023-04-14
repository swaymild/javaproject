//0403 index5~14, Switch1~2, Double1~3
package java1;

import java.util.Scanner;

public class index14 {
	
	//할인율 구하는 공식
	public static void main(String[] args) {
		
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;
		
		int total = (int)Math.round(c);
		//(int) : double 자료형을 int로 변환시킬 때
		
//		int c = money * (100-coupon) / 100;
//		double sum = money - (money*(coupon * 0.01));
		//한줄 라인으로 표현
		System.out.println(total);
		
		/*
		 응용문제4.
		 총 상품금액이 50000 원입니다.
		 사용자에게 "할인 쿠폰을 얼마를 적용할까요?"라는 질문과 함께
		 숫자를 받습니다. 결과값으로 사용자가 적용한 할인율을 최종 상품금액으로
		 출력하시오.
		 예시) 
		 총 상품금액 50000원 할인 쿠폰을 얼마를 적용할까요?
		 20
		 최종 상품금액은 40000원 입니다.
		 */
		
		int price = 50000;
		System.out.println("할인 쿠폰을 얼마를 적용할까요?");
		Scanner sc = new Scanner(System.in);
		double sale = sc.nextDouble() / 100;
		int saleprice = (int)Math.floor(price * sale);
		int sum1 = price - saleprice;
		sc.close();
		System.out.printf("상품금액 : %d 할인된 금액 : %d 최종 상품금액 : %d",price,saleprice,sum1);
		
	}

}
