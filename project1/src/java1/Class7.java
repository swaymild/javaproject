package java1;

import java.util.Scanner;

public class Class7 {

	//응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행
	public static void main(String[] args) {
		//해당 코드는 단 한줄로만 사용 (외부 클래스 기준으로만 코드 작성)
		new Member3();
		
//	new Ship();
	}

}

class Member3 {
	Scanner sc = new Scanner(System.in);
	public Member3() {
		agree();
	}
	public void agree() {
		System.out.println("회원가입 약관에 동의하시겠습니까? (y / n)");
		String yorn = sc.next();
		inout(yorn);
	}
	public void inout(String a) {
		if(a.equals("y")) {
			go();
		}
		else {
			System.out.println("회원가입이 취소되셨습니다");
		}
	}
	public void go() {
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		if(id.equals("admin")) {
			System.out.println("중복된 아이디입니다");
			go();
			System.exit(0);
		}
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next();
		System.out.println("가입자명을 입력하세요");
		String name = sc.next();
		
		System.out.println("정상적으로 회원가입이 완료되었습니다");
		System.out.printf("id : %s 패스워드 : %s 고객명 : %s",id,pw,name);
		sc.close();
		
	}
}

//class Ship {
//	public Ship() {
//		agree();
//	}
//	public void agree() {
//		String ag1 = inputs("회원가입 약관에 동의하시겠습니까? (y/n) : ","");
//		if(ag1.equals("y")) {
//			String ag2 = inputs("아이디를 입력하세요","");
//			if(ag2.equals("admin")) {
//				System.out.println("해당 아이디는 중복 되었습니다");
//			}
//			else {
//				String ag3 = inputs("패스워드를 입력하세요","");
//				String ag4 = inputs("가입자명을 입력하세요","y");
//				System.out.printf("아이디:%s 패스워드:%s 가입자명:%s",ag2,ag3,ag4);
//			}
//		}
//		else {
//			System.out.println("회원가입이 취소되었습니다.");
//			System.exit(0);
//		}
//	}
//	public String inputs(String msg,String exit) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		String result = sc.next();
//		if(exit == "y") {
//		sc.close();
//		}
//		return result;
//	}
//}