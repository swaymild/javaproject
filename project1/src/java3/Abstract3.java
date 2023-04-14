//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public class Abstract3 {
	
	//상속 2개 이상 가져오기 
	public static void main(String[] args) {
		
		

	}

}

//추상 클래스는 super가 없음
class ab3 extends aa2 { 
	//aa추상 클래스에 aa2상속을 받은후  외부 클래스에서 로드할 경우
	//aa에 사용한 메소드도 호출해야함
	@Override
	public String user_info() {
		return null;
	}
	@Override
	public int password() {
		return 0;
	}
}

//super : 일반 메소드의 상속값을 받아옴
class ab4 extends aa3 {
	@Override
	public String aa3_method() {
		return super.aa3_method();
	}
}