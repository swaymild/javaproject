package java1;

import java.util.Scanner;

public class index9 {

	//한줄 이상 입력 관련 및 공백
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Q.두 개의 숫자를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//nextInt(),next() : 스페이스바 또는 엔터를 이용하여 2개의 숫자 또는 문자를 입력가능
		System.out.printf("첫번째 숫자 %d, 두번째 숫자 %d",a,b);
		System.out.println("\nQ.두명의 이름을 입력하세요");
		String c = sc.next();
		String d = sc.next();
		System.out.printf("첫번째 이름 : %s, 두번째 이름 : %s",c,d);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("\nQ.주소를 입력하세요");
		String e = sc2.nextLine();
		/*
		 sc라는 객체는 이미 next(),nextInt()를 사용했으므로 
		 nextLine() 사용하지 못하여 신규 객체를 생성
		 
		 nextLine() : 스페이스바는 공백으로 인식
		*/
		System.out.println("주소 : " + e);
		sc.close();
		sc2.close();
		
	}

}
