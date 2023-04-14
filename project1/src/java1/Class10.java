//0404 Class1~10
package java1;

import java.util.Scanner;

public class Class10 {

	//로그인 프로세서
	public static void main(String[] args) {
		/*
		 * 1.아이디를 입력하세요 2.패스워드를 입력하세요 3.hong / a123456 입력시 로그인되었습니다. 4.hong 외에 아이디는 가입되지
		 * 않은 사용자입니다. 단, hong으로 아이디 입력 후 패스워드를 총 3회 틀릴경우
		 * "해당 아이디는 10분 후에 다시 로그인 하실수 있습니다." 라는 메세지를 출력
		 */
//		new login();
		
		userlogin ul = new userlogin();
		ul.login();
	}

}

//class login {
//	Scanner sc = new Scanner(System.in);
//	int count = 0;
//
//	public login() {
//		logins();
//	}
//
//	public void logins() {
//		String id = text("아이디를 입력하세요");
//		if (id.equals("hong")) {
//			pwck();
//		}
//		else {
//			text("패스워드를 입력하세요");
//			System.out.println("가입되지 않은 사용자입니다");
//			logins();
//		}
//		sc.close();
//	}
//
//	public String text(String a) {
//		System.out.println(a);
//		String result = sc.next();
//		return result;
//	}
//	
//	public void pwck() {
//		String pw = text("패스워드를 입력하세요");
//		if (pw.equals("a123456")) {
//			System.out.println("로그인 되셨습니다");
//		} 
//		else {
//			count++;
//			if(count < 3) {
//				System.out.println("아이디 및 패스워드를 확인하세요");
//				pwck();
//			}
//			else {
//				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실수 있습니다");
//			}
//		}
//	}
//	
//}

class userlogin {
	
	Scanner sc = new Scanner(System.in);
	int count = 0; //패스워드 카운팅 (3회 틀릴경우 로그인 잠김)
	String msg = ""; //return에서 사용되는 결과값 변수
	
	public String pwck(String id) {
		count++;
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next();
			if(pw.equals("a123456") && id.equals("hong")) {
				msg = "yes";
			}
			else {
				if(count < 3) {
					System.out.println("패스워드가 틀립니다.("+count+")");
					pwck(id); //return함수 재호출
				}
				else {
					msg = "no";
				}
			}
			return msg;
	}
	
	public void login() {
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		String result = pwck(id); //패스워드 입력 및 검토
		//result : yes 로그인 성공, no : 로그인 실패 10분후 다시 로그인 가능
		if(result.equals("yes")) {
			System.out.println("로그인 되셨습니다");
		}
		else {
			if(!id.equals("hong")) {
				System.out.println("가입되지 않은 사용자입니다");
			}
			else {
				System.out.println("해당 아이디는 10분후 다시 로그인하실 수 있습니다");
			}
		}
		sc.close();
	}
	
}

