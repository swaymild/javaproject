//0411 Method11~18, Over1~3, Sleep, Awt1, Abstract1
package java2;

//사용자 정보리스트
public class Over1 {
	//오버라이드를 할 경우 필드에 변수를 셋팅해야함
	String list[][] = {
			{"홍길동","hong","서울","hong@nate.com","SKT"},
			{"이순신","lee","인천","lee@nate.com","KT"},
			{"강감찬","kang","제주","kang@naver.com","KT"},
			{"장보고","jang","강원","jang@gmail.com","LGT"}
	};
	public String se;
	int money;
	public void userlist(String username) {
		this.se = username;
		this.money = 10000;
	}
	
}
