//0405 Array1~12, Class_array1~2(Data1,Scoring)
package java1;

import java.util.Scanner;

public class Class_array2 {
	
	//2개의 배열값 - scoring.java 연계 (4/5)
	public static void main(String[] args) {
		/*
		 응용문제2.
		 1."검색하고자하는 이름을 적어주세요" 출력
		 2.검색어에 이순신 검색을 하면 "이순신님은 80점입니다"라고 출력
		 단, scoring에서는 해당 배열에 있는 데이터를 검색하는 용도로만
		 사용되도록함.
		 */
		
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[] = {"100","80","39","42","55"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String nm = sc.next(); //사용자 입력단어
		sc.close();
		scoring scr = new scoring(); //외부 class 객체 생성
		scr.sc(a1,a2,nm); //해당 메소드로 3개의 인자값 전달
		
	}

}
