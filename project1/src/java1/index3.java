package java1;

public class index3 {

	public static void main(String[] args) {
		
		//if문
		//+,-,*,/ 사칙연산
		int a,b;
		a = 10*2;
		b = 20;
		if(a < b) {
			System.out.println("b값이 큽니다.");
		}
		else if(a > b) {
			System.out.println("a값이 큽니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		/* 
		응용문제1.
		1번 항목 숫자 10, 9, 22
		2번 항목 숫자 19, 10, 2
		첫번째 두번째 숫자는 더하며, 세번째 숫자는 곱할경우
		결과값이 작은 항목이 출력되도록 코드를 작성하시오.
		결과는 예시) 1번항목이 결과가 작습니다.
 		 */
		byte c = 10;
		byte cc = 9;
		byte ccc = 22;
		int csum = c + cc * ccc;
		byte d = 19;
		byte dd = 10;
		byte ddd = 2;
		int dsum = d + dd * ddd;
		if(csum < dsum) {
			System.out.println("1번 항목이 작습니다.");
		}
		else if(csum > dsum) {
			System.out.println("2번 항목이 작습니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		String userid = "hong";
		String userpw = "a12345";
		if(userid == "hong" && userpw == "a12345") {
			System.out.println("로그인 되셨습니다.");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		
		//정수에서 소수점 결과를 출력하는 경우
		int a1 = 100;
		double a2 = a1 / (double)3;
		System.out.println(a2);
		
		/*
			Integer : 매개체에 대한 속성 
			.toSting() 문자열 변환
			.parseInt() 또는 valueOf() 문자를 숫자로 변환
		*/
			
		//숫자를 문자로 변환하여 출력하는 경우
		int b1 = 500;
		String b2 = Integer.toString(b1);
		System.out.println(b2);
		
		//문자를 숫자로 변환하여 출력하는 경우
		String c1 = "600";
		int d1 = 10;
//		int sum = Integer.valueOf(c1) + d1;
		int sum = Integer.parseInt(c1) +d1;
		System.out.println(sum);
		
		//증가(++),감소(--)
		int z = 10;
		z++;
		System.out.println(z);
		
		//+=, -=, *=, /=
		int k = 50;
		k += k;
		System.out.println(k);
		
		//간단 문자 표현 (char - ''로 적용)
		char f = 'H';
		System.out.println(f);
	}

}
