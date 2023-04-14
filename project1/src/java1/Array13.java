//0406 Array13, Random1~2, Method1~6
package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {

	//사용자 아이디 입력 및 배열 데이터로 변환
	public static void main(String[] args) {
		
		String lists = "";
		Scanner sc = new Scanner(System.in);
		
		int f;
		for(f=0;f<=4;f++) {
			System.out.println("학급 학생 아이디를 입력하세요");
			String id = sc.next();
			lists += id + " ";
		}
		sc.close();
		
		//반복문없이 사용
//		String id = sc.next();
//		lists = id;
		
		System.out.println(lists);
		String userdata[] = lists.split(" ");
		//split : 문자열 또는 숫자열을 특정 문자 기준으로 배열화하는 명령어
		System.out.println(Arrays.toString(userdata));
		

	}

}
