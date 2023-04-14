package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		
		Member2 mb = new Member2();
//		mb.list("홍길동", 5);

		/*
		 응용문제5.
		 Member2 class 안에 신규 메소드를 생성하여 다음과 같이 결과가
		 나올수 있도록 코드를 작성하시오.
		 단, 사용자가 직접 구구단 숫자를 입력합니다.
		 예시)
		 "사용하실 구구단 숫자를 하나 입력하세요"
		 [결과] - 해당 구구단 출력 단, 역순으로 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 하나 입력하세요");
		int a = sc.nextInt();
		mb.gugu(a);
		sc.close();
		
	}

}

class Member2 {
	//일반 메소드는 인자값을 복합적으로 적용 가능
	public void list(String user,int level) {
		System.out.printf("고객명 : %s 레벨 : %d",user,level);
	}
	public void gugu(int a) {
		int b = 9;
		while(b>=1) {
			System.out.printf("%d * %d = %d\n",a,b,a*b);
			b--;
		}
	}
}
