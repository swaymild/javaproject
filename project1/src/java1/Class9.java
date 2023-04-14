package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {

		System.out.println("1.무지개룸 2.패밀리룸 3.달빛아래룸");
		Scanner sc = new Scanner(System.in);
		System.out.println("방번호를 입력하세요");
		int number = sc.nextInt();
		if(number > 3) {
			System.exit(0);
		}
		int money = 0;
		switch(number) {
		case 1:
			money = 60000;
			break;
		case 2:
			money = 125000;
			break;
		case 3:
			money = 100000;
			break;
		}
		System.out.printf("%d 선택 가격은 %d 원",number,money);
		System.out.println("30% 할인 쿠폰을 적용하시겠습니까?(y/n)");
		String result = sc.next().intern();
		if(result=="n") {
			System.out.println("결제하실 금액은" + money + "원");
		}
		else {
			double sales = money * 0.7;
			System.out.println(Math.round(sales));
		}
		sc.close();
		
		
		
//		new Room();

	}

}

class Room {
	Scanner sc = new Scanner(System.in);
	int price;
	
	public Room() {
		int ag1 = roomno("1.무지개룸 2.패밀리룸 3.달빛아래룸");
		roomprice("30% 할인쿠폰을 적용하시겠습니까? (y/n)", ag1);
	}

	public int roomno(String msg) {
		System.out.println(msg);
		int result = sc.nextInt();
		if (result != 1 && result != 2 && result != 3) {
			System.out.println("올바른 값이 아닙니다");
			roomno("1.무지개룸 2.패밀리룸 3.달빛아래룸");
		}
		return result;
	}

	public void roomprice(String msg, int a) {
		if (a == 1) {
			price = 60000;
		} 
		else if (a == 2) {
			price = 125000;
		} 
		else {
			price = 100000;
		}
		System.out.printf("가격은 %d\n", price);
		System.out.println(msg);
		String result = sc.next();
		sc.close();
		coupon(result);
	}

	public void coupon(String b) {
		if (b.equals("y")) {
			System.out.printf("\n30%% 할인된 가격은 %d 입니다", price * (100 - 30) / 100);
		}
		else {
			System.out.printf("\n가격은 %d 입니다", price);
		}
		
	}
	
//	Scanner sc = new Scanner(System.in);
//	int price;
//	
//	public Room() {
//		roomno();
//	}
//	public void roomno() {
//		int ag1 = ip2("1.무지개룸 2.패밀리룸 3.달빛아래룸");
//		if(ag1<=3 || ag1<0) {
//			if (ag1 == 1) {
//				price = 60000;
//			} 
//			else if (ag1 == 2) {
//				price = 125000;
//			} 
//			else {
//				price = 100000;
//			}
//			System.out.printf("가격은 %d\n", price);
//		}
//		else {
//			System.out.println("올바른 값이 아닙니다");
//			roomno();
//			System.exit(0);
//		}
//		String ag2 = ip("30% 할인쿠폰을 적용하시겠습니까?");
//		if(ag2.equals("y")) {
//			System.out.printf("\n30%% 할인된 가격은 %d원 입니다", price * (100 - 30) / 100);
//		}
//		else {
//			System.out.printf("\n가격은 %d원 입니다", price);
//		}
//		sc.close();
//	}
//	
//	
//	public String ip(String msg) {
//		System.out.println(msg);
//		String result = sc.next();
//		return result;
//	}
//
//	public int ip2(String msg) {
//		System.out.println(msg);
//		int result = sc.nextInt();
//		return result;
//	}
}
