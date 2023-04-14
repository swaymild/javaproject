package project1;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * (주)데브시스터즈 코딩 면접 응용문제4. 업,다운 퀴즈 pc가 1~10까지 임의숫자를 선택 (단, interface 사용)
		 * 
		 * "1~10까지 숫자 중 하나를 입력하세요" 출력 후 사용자가 숫자 하나를 선택
		 * 
		 * 결과는 pc가 4, 사용자가 8을 선택했을 경우 Down pc가 4, 사용자가 1이라면 Up 메세지를 출력 단,횟수는 4회만 할수있도록함
		 * pc와 사용자가 뽑은 숫자가 동일할 경우 "정답" 메세지 출력 4회까지 맞추지못할 경우 "정답을 맞추지 못했습니다" 메세지 출력
		 */
		game g = new game();
		g.updown();

	}

}

class game implements Example1_1 {

	Scanner sc;
	int userno = 0;

	@Override
	public int pcnum() {
		int pcno = this.pcno;
		return pcno;
	}

	@Override
	public void updown() {
		int pcno = pcnum();
		int count = 0;
		System.out.println("1~10까지 숫자 중 하나를 입력하세요");
		while (true) {
			try {
				this.sc = new Scanner(System.in);
				int userno = sc.nextInt();
				if (userno > 10 || userno < 1) {
					System.out.println("1~10 사이의 숫자를 입력하세요");
				} 
				else {
					if (pcno == userno) {
						System.out.println("정답입니다!");
						break;
					} 
					else {
						count++;
						if (count >= 4) {
							System.out.println("정답을 맞추지 못했습니다");
							break;
						} 
						else {
							if (pcno < userno) {
								System.out.println("Down");
							} 
							else {
								System.out.println("Up");
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}
		}

	}
}