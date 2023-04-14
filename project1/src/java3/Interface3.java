//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public class Interface3 {

	//user1, user2 응용편
	public static void main(String[] args) {
	/*
	 응용문제2.(주)리노스
	 가입된 모든 사용자의 정보를 출력합니다.
	 출력형태는 다음과 같습니다.
	 아이디 : hong 고객명 : 홍길동 이메일 : hong@nate.com 지역 : 서울시 영등포구
	 */
		allinfo all = new allinfo();
		all.myinfo("");

	}

}

class allinfo implements user1{
	//user2 인터페이스는 로드하지않음
	//단, user2에 있는 필드 변수명을 별도로 호출할 수 있음
	int node = 0;
	@Override
	public void myinfo(String userid) {
		for(String[] a:user1.userdata) {
			System.out.printf("아이디:%s 고객명:%s 이메일:%s 지역:%s\n",
					user1.userdata[node][0],user1.userdata[node][1],user1.userdata[node][2],user2.infodata[node][2]);
			this.node++;
		}
	}
	@Override
	public void mytel(String usertel) {
		
	}
}
