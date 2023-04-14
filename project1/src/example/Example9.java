package example;

import java.util.*;

public class Example9 {

	Scanner sc = new Scanner(System.in);
	String data[][] = {
			{"콜라","사이다","환타","포카리"},
			{"500","500","600","800"}
	};
	
	public static void main(String[] args) {
		/*
		 자판기 프로세서 개발 다음과 같이 작동되도록 코드를 작성합니다.
		 "금액을 입력하세요:"
		 "다음 메뉴를 선택하세요 [콜라,사이다,환타,포카리]:"
		 "최종 남은 금액은 xxx 입니다."
		 */
		Example9 ex = new Example9();
		ex.drink();

	}

	public void drink() {
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt(); //사용자가 입력한 금액
		int total = menus(money);
		if(total < 0) {
			System.out.println("잔액이 부족합니다");
		}
		else {
			System.out.printf("최종 남은 금액은 %d 원입니다",total);
		}
	}
	
	public int menus(int m) {
		System.out.printf("다음 메뉴를 선택하세요 %s",Arrays.toString(data[0]));
		String product = sc.next(); //사용자가 선택한 메뉴
		int node = 0;
		int result = 0; //계산 초기값 변수
		for(String f:data[0]) {
			if(product.equals(f)) {
				result = m - Integer.parseInt(data[1][node]);
			}
			node++;
		}
		return result;
	}
	
}
