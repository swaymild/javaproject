//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public interface user1 {
	String userdata[][] = {
			{"hong","홍길동","hong@nate.com","01012345678"},
			{"hongapink","홍길동","hong_gil@gmail.com","01056471122"},
			{"kim","김유신","kim_usin@naver.com","01022334787"},
			{"jang","장보고","jang_bk@hanmail.net","010223369"},
			{"kangkam_chan","강감찬","kk_chan@nate.com","01033226987"}
			};
	
	default int dataea() {
		int ea = user1.userdata.length;
		return ea;
	}
	
	public void myinfo(String userid);
	public void mytel(String usertel);
}
