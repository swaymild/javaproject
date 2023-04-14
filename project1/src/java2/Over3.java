//0411 Method11~18, Over1~3, Sleep, Awt1, Abstract1
package java2;

import java.util.Arrays;

public class Over3 {
	/*
	 응용문제4.
	 각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오
	 예시) 
	 SKT : 1명
	 KT : 2명
	 LGT : 1명
	 */
	//메인 실행 //class:Over1 , method:userlist (String), 변수명:list
	public static void main(String[] args) {
		
		corp co = new corp();
		co.userlist("");

	}

}

class corp extends Over1 {
	
	int sktc = 0;
	int ktc = 0;
	int lgtc = 0;
	int node = 0;
	
	@Override
	public void userlist(String username) {
		
		super.userlist(username);
		for(String[] a:list) {
			if(list[node][4].equals("SKT")) {
				sktc++;
			}
			else if(list[node][4].equals("KT")) {
				ktc++;
			}
			else if(list[node][4].equals("LGT")) {
				lgtc++;
			}
			node++;
		}
		System.out.printf("SKT : %d명\nKT : %d명\nLGT : %d명\n",sktc,ktc,lgtc);
	}
}
