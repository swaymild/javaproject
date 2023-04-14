package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 (주)CJ운송 코딩테스트
		 사용자가 8명 있음.
		 각각 사용자에게 포인트를 주어야함.
		 다음 결과가 나오도록 코드작성.
		 customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
		 "서울 님에게 포인트 추가하시겠습니까?"
		 ...
		 "전남 님에게 포인트 추가하시겠습니까?"
		 
		 무조건 숫자 입력해야하며 숫자외 입력시 "포인트는 숫자만 입력합니다" 출력
		 
		 단 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
		 "인천 님에게 포인트 추가하시겠습니까?" 라고 메세지 출력
		 
		 최종결과 정보
		 서울 : 500
		 경기도 : 300
		 인천 : 300
		 ...
		 */
		point p = new point();
		p.point();
	}

}

class point {
	String area[] = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
	Map<String, Integer> aream = new LinkedHashMap<>();
	Scanner sc;
	
	public void point() {
		int count = 0;
		while(true) {
			try {
				System.out.println(area[count]+" 님에게 포인트 추가하시겠습니까?");
				sc = new Scanner(System.in);
				int p = sc.nextInt();
				if(p > 0) {
					aream.put(area[count], p);
					count++;
				}
				if(count>=8) {
					break;
				}
			}catch (Exception e) {
				System.out.println("포인트는 숫자만 입력하세요");
				continue;
			}
			
		}
		System.out.println(aream);
		int w = 0;
		while(w < area.length) {
			System.out.printf("%s : %d\n",area[w],aream.get(area[w]));
			w++;
		}
		
	}
}
