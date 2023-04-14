package java1;

import java.text.SimpleDateFormat;
import java.util.*; //모든 java.util에 있는 클래스를 로드함

public class index13 {
	//JAVA : OOP (객체지향언어), Javascript : OOP 스크립팅 언어
	//날짜 출력 형태
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		//y:년, MM:월, d:일
		SimpleDateFormat time = new SimpleDateFormat("H:mm:ss");
		//H:시간, m:분, s:초, 소문자h: am,pm 별도로 구성
		//format() : 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat date2 = new SimpleDateFormat("hh:mm:ss a");
		//a : 오전, 오후 표시
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));

	}

}
