package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP3 {

	/*
	 (주)씨이랩
	 응용문제2.
	 본 데이터 15,22,37,8,11,19,41이 있습니다
	 해당 본 데이터를 다음 결과같이 커스텀하여 출력하시오
	 커스텀 결과 [7,15,22,8,11,39,41]
	 */
	public static void main(String[] args) {
		
//		Integer no[] = {15,22,37,8,11,19,41};
//		ArrayList<Integer> data = new ArrayList<>(Arrays.asList(no));
		ArrayList<Integer> data = new ArrayList<>(Arrays.asList(15,22,37,8,11,19,41));
		
		data.add(0,7);
		data.remove(3);
		data.set(5,39);
		
		System.out.println(data);

	}

}
