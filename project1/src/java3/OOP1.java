//0412 List4~6, Heap, Try, Map1, OOP1~4(ab1)
package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1 {

	// List, ArrayList, LinkedList, Map(key)
	public static void main(String[] args) {

		/*
		 * 응용문제1. 사용자가 입금을 처리함 총 8번의 횟수 금액을 입력하게 되며, 모든 입금이 완료되었을 경우 최종 합계 금액을 출력시키는
		 * 프로세서를 구축하시오 예시) 입금할 금액을 입력하세요 500 입금할 금액을 입력하세요 1000 ... 500 1000 500 1500
		 * 200 100 50 50 최종 입금금액 : 3,900 원
		 */
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> money = new ArrayList<>();
//		int w = 0;
//		Integer m;
//		int sum = 0;
//		try {
//		while(w<8) {
//			System.out.println("입금하실 금액을 입력하세요");
//			m = sc.nextInt();
//			money.add(m);
//			sum += m;
//			w++;
//		}
//		} catch (Exception e) {
//			
//		}
//		sc.close();
//		
//		DecimalFormat dcm = new DecimalFormat("###,###");
//		System.out.println(money);
//		System.out.printf("최종 입금금액 : %s 원",dcm.format(sum));

		bank ba = new bank();
		ba.indata();

	}

}

class bank {
	//메모리에 등록
	Scanner sc;
	LinkedList<Integer> li;
	Integer sum = 0;

	public void indata() {
		this.li = new LinkedList<>();
		while (true) {
			try { //숫자 입력시
				this.sc = new Scanner(System.in);
				System.out.println("입금할 금액을 입력하세요");
				int money = this.sc.nextInt();
				this.sum += new Integer(money); //heap로 설정
				this.li.add(money);
				int count = this.li.size(); //사용자가 입력한 누적 배열 데이터 갯수
				if (count == 8) { //배열 데이터 갯수 제한
					break; //무한 loop 종료
				}
			} catch (Exception e) { //숫자 미입력시
				System.out.println("제발 숫자만 입력하세요");
				continue; //반복문으로 복귀
			}
		}
		this.sc.close();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(this.li);
		System.out.println("입금한 총 금액은 "+df.format(this.sum)+" 원");
	}
}
