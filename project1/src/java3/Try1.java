//0412 List4~6, Heap, Try, Map1, OOP1~4(ab1)
package java3;

import java.util.Scanner;

public class Try1 {

	//예외처리방식
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);;
		int box;
		//try~catch : 예외 처리문
		try { //오류 발생시 체크
		System.out.println("숫자를 입력하세요");
		box = sc.nextInt();
		System.out.println("사용자는 " +box+ " 을 입력하셨습니다");
		}
		catch (Exception e) { //오류 발생된 사항
			System.out.println(e);
			System.out.println("숫자만 입력하세요");
		}

	}

}
