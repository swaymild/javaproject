//0412 List4~6, Heap, Try, Map1, OOP1~4(ab1)
package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	//무한루프로 배열 코드 연계
	public static void main(String[] args) {

//		for(;;) {}  //for문 무한루프
		
		//무한루프 사용이유 : DB의 갯수를 전체적으로 반복시키기 위함
		Scanner sc = new Scanner(System.in);
		//빈배열
		ArrayList<Integer> al = new ArrayList<>(); //빈배열 (숫자만)
		Integer no; //사용자가 입력한 숫자값을 저장하는 변수
		while(true) {
			System.out.println("숫자를 입력하세요");
			no = sc.nextInt();
			al.add(no); //빈배열에 순차적으로 데이터 입력
			int ea = al.size(); //배열의 크기를 확인
			if(ea >= 10) { //배열의 크기가 10개 이상일때 반복문 강제종료
				break;
			}
		}
		System.out.println(al);
		
	}

}
