package java2;

import java.util.Arrays;

public class Method2 {

	//return 값을 이용한 메소드
	public static void main(String[] args) {
		
		//1개 이상의 데이터를 split으로 return 데이터 이관
		test2 t = new test2();
		String data1 = t.userinfo1();
		String info[] = data1.split(",");
		System.out.println(Arrays.toString(info));
		
		//배열로 해당값을 모두 받아서 처리
		String data2[] = t.userinfo2();
		System.out.println(Arrays.toString(data2));

	}

}

class test2 {
	
	String user_name = "홍길동";
	String user_id = "hong";
	
	public String userinfo1() { //문자열 "," 기준으로 데이터를 보냄
		String user_info = user_name +","+ user_id;
		return user_info;
	}
	public String[] userinfo2() { //배열 return 메소드
		String user_info2[] = {user_name,user_id}; //배열 생성
		return user_info2; //배열값 return
	}
	
}