package example;

import java.util.Scanner;
/*
 응용문제1.
 질문 : "7000원 결제하시겠습니까?" 출력
 숫자 1을 입력하면 "결제가 진행됩니다." 출력 후 프로세서 종료
 숫자 2를 입력하면 "결제가 취소되었습니다." 출력 후 프로세서 종료
 */
public class Example3 {
	
	final int money = 7000;
	Scanner sc = new Scanner(System.in); //가상으로 입력받는 클래스
	
	public static void main(String[] args) {
		
		Example3 ex3 = new Example3();
		ex3.pay();

	}
	
	public void pay() {
		System.out.printf("%d원 결제하시겠습니까?",this.money);
		int no = this.sc.nextInt();
		//String일 경우 intern() 또는 equals 사용해야 조건 확인 가능
		if(no == 1) {
			System.out.println("결제가 진행됩니다");
		}
		else if(no == 2){
			System.out.println("결제가 취소되었습니다");
		}
		this.sc.close();
	}

}
