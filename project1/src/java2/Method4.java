package java2;

public class Method4 {

	//private에 대한 객체 선언 형태2 (4/6)
	public static void main(String[] args) {

		insert i = new insert();
		i.userid = "hong"; //아이디값
		String member_key = "123456"; //보안키
		String msg = i.checks(member_key); //리턴으로 결과값 확인
		
		if(msg.equals("ok")) {
			System.out.println("정상적인 접근");
		}
		else {
			System.out.println("올바른 접근이 아닙니다");
		}

	}

}

class insert {
	
	String userid = null;
	private String key = "memberok"; //내부 변수로 값을 변경못함
	
	public String checks(String userkey) { //main에서 인자값을 보낸 보안키
		String call = "";
		if(userkey.equals(key)) { //내부 변수값과 인자값을 비교하여 같을 경우
			call = "ok";
		}
		else { //다를 경우
			call = "error";
		}
		return call; //return으로 값 이관
	}
	
}