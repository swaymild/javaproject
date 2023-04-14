//0412 List4~6, Heap, Try, Map1, OOP1~4(ab1)
package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP4 {

	/*
	 (주)이루온 - 코딩테스트
	 해당 원시 배열 데이터를 이용하여 추상 클래스에서 해당 결과값이
	 돌출 될 수 있도록 코드를 작성하시오.
	 회원 전체의 포인트 합계를 출력하시오. (abstract 사용)
	 ※ 추상 클래스명 : Userinfo
	 */
	public static void main(String[] args) {
		
		memberinfo m = new memberinfo();
		m.point();

	}

}

class memberinfo extends Userinfo2 {
	ArrayList<String[]> member2;
	@Override
	void point() {
		this.member2 = new ArrayList<String[]>(Arrays.asList(this.member));
		int w = 0;
		int sum = 0;
		while(w < member2.size()) {
			sum += Integer.parseInt(member2.get(w)[6]);
			w++;
		}
		System.out.println(sum);
	}	
		
	
}
