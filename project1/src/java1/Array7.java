package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	//배열 생성 응용편
	public static void main(String[] args) {
		
		/*
		 응용문제6.
		 1.사용자가 상품을 검색
		 2.검색 내용을 배열로 저장
		 예시)
		 상품검색 : 선풍기
		 상품검색 : 냉장고
		 상품검색 : 모니터
		 상품검색 : 검색종료
		 
		 [선풍기, 냉장고, 모니터, null, null, null, null];
		 */
		
		String pd[] = new String[7];
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		while(a<7) {
			System.out.println("검색하실 제품을 입력하세요");
			String slt = sc.nextLine().intern();
			if(slt == "검색종료") {
				System.out.println("검색이 종료됩니다");
				break;
			}
			else {
				pd[a] = slt;
			}
			a++;
		}
		sc.close();
		System.out.println(Arrays.toString(pd)); 
		//Arrays.toString : 숫자, 문자, 소수[] 현재 배열 변수값을 출력하는 메소드

	}

}
