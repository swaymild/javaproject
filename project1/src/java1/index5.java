//0403 index5~14, Switch1~2, Double1~3
package java1;

import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		//Scanner : 사용자가 직접 값을 입력하는 도구툴
		//System.in(입력) != System.out(출력)
		//new : 객체를 선언하는 것을 말함
		int a = 10; //비교 숫자
		System.out.println("사용자가 원하는 숫자를 입력하세요");
		//print, printf : 같은 라인으로 출력
		//println : 각각의 라인으로 출력(br)
		int b = sc.nextInt(); //사용자 입력값을 숫자값으로 받음
//		String b = sc.next();	//사용자 입력값을 문자값으로 받음
		if(a > b) {
			System.out.println("업");
		}
		else if(a < b) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답입니다");
		}
		
		sc.close(); //Scanner를 사용 후 종료선언을 해야함
		
	}

}
