package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {

	//List 배열 사용법
	//List : (Array 업그레이드) 순서가 있는 데이터 집합 배열과는 다르게 빈배열 값을 허용하지않음
	//메모리 공간의 크기를 동적으로 변경가능
	//메모리 재사용이 편리함
	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		List<String> aa = new ArrayList<>(Arrays.asList(data));
		aa.remove("park");
		System.out.println(aa);
		
		//1 = 1M
		List<Integer> bb = new ArrayList<>(1); //메모리 초기 용량 크기(기본10)
		int w = 0;
		while(w < 10) {
			bb.add(w);
			w++;
		}
		
		System.out.println(bb.size());
	}

}
