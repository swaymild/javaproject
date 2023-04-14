//0406 Array13, Random1~2, Method1~6
package java1;

import java.util.Scanner;

public class Random1 {

	//random 메소드 이용법 + 재귀 메소드(자신의 메소드 또는 다른 메소드 호출)
	public static void main(String[] args) {
		
		int number = (int)Math.ceil(Math.random()*10);
		//Math.ceil : 올림
		//Math.floor : 내림
		//Math.round : 반올림
		System.out.println(number);
		
		/*
		 문제. 
		 컴퓨터가 하나의 숫자를 뽑음
		 사용자가 해당 숫자를 맞추는 게임
		 단,틀릴 경우 컴퓨터는 다시 다른 숫자를 뽑음
		 맞을 경우 : "정답" , 틀릴 경우 : "실패"
		 */
		
		game g = new game();
		g.pc();
	
	}

}

class game {
	
	Scanner sc = new Scanner(System.in);
	//this : 해당 class 안에서 사용되는 모든것을 지칭함
	
	public void pc() {
		int ai = (int)Math.ceil(Math.random()*5);
		//1~5까지 pc가 무작위 숫자를 선택
		System.out.println("1~5까지 숫자 중 하나를 입력하세요");
		int person = this.sc.nextInt();
		
		if(person == ai) {
			System.out.println("정답");
			this.sc.close();
		}
		else {
			System.out.println("실패");
			this.pc(); //재귀함수로 자신의 메소드를 다시 재호출
		}
	}
	
}