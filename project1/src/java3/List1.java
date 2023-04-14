//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	//List 라이브러리
	public static void main(String[] args) {

		String member[] = {"박소은","윤준승","김여름"};
		//ArrayList : java 라이브러리 배열 메소드
		//Arrays.asList : 로드할 배열값
		//add():추가, get():배열데이터 로드, remove():배열값 삭제, size():배열데이터 갯수
		//중요사항 : add 사용시 무조건 맨 뒤에 데이터 추가됨. 
		//단, index번호를 적용 후 실행시 해당 index부분에 추가 될 수 있음
		ArrayList<String> al = new ArrayList<>(Arrays.asList(member));
		System.out.println(al.size());
		/* 
		al.add("박소은");
		al.add("윤준승");
		al.add("김여름");
		 */
		al.add(1,"심규환");
		al.add("이하늘");
		System.out.println(al);
		String user = al.get(4);
		System.out.println(user);
		al.remove(4);
		System.out.println(al);
		
	}

}
