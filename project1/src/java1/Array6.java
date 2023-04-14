package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
	
	//배열 + 키오스크 응용편 (4/5)
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int w = 1;
//		while(w < 5) {
//			System.out.println("선택하세요");
//			int select = sc.nextInt();
//			if(select == 0) { //사용자가 0을 입력시
//				System.out.println("종료");
//				break; //반복문 강제종료
//			}
//			w++;
//		}
		
		/*
		 응용문제5.
		 1."주문하고자하는 음식을 선택해주세요" 메세지 출력
		 2.사용자가 원하는 음식을 선택
		 3.선택된 음식 리스트 출력 단, 주문종료를 선택했을 경우만
		 주문한 음식리스트가 나와야함.
		 4.메뉴 : 햄버거, 피자, 치킨, 라면, 김밥, 커피
		 예시)
		 "주문하고자하는 음식을 선택해주세요"
		 1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료
		 [치킨, 라면, 햄버거, null, null, null]
		 */
		String menu[] = {"햄버거","피자","치킨","라면","김밥","커피"};
		int ea = menu.length;
		String order[] = new String[ea];
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		while(a <= menu.length) {
			System.out.println("주문하고자하는 음식을 선택하세요");
			System.out.println("1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료");
			int select = sc.nextInt();
			if(select == 7) {
				System.out.println("선택을 완료하셨습니다");
				break;
			}
			else {
				order[a] = menu[select-1];
			}
			a++;
		}
		sc.close();
		System.out.println(Arrays.toString(order));
		
//		for(String f:order) {
//			if(f != null) {
//				System.out.printf("%s ",f);
//			}
//		}
		
		
		
		
		
	}

}
