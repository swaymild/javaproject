package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	//Arraylist 배열 문자,순자 혼합 사용하기
	public static void main(String[] args) {
		String data[] = {"hong","park"}; //문자열 배열
		int data2[] = {10,20}; //숫자열 배열
		//현재 배열 자료형은 2가지
		
		//ArrayList에 자료형이 String이므로 int 배열은 받지못함
		//해당 방식은 Object를 사용
		/*
		 Object : 문자, 숫자 자료형과 관련없이
		 모든 자료형을 다 받아주는 자료형 구조
		 */
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		
		//계산방식 - 첫번째 방식
//		int sum = (int)li.get(2) + (int)li.get(3);
		//2번째 방식
//		Object sum = (int)li.get(2) + (int)li.get(3);
		//3번째 방식
		Integer sum = (Integer)li.get(2) + (Integer)li.get(3);
		
		System.out.println(sum);
		
		//자료형이 Object인 ArrayList 안에 데이터가 어떤 자료형인지 알아내는 방법
		
		/*
		 Object는 한가지 자료형만 받는 형태가 아니므로 .getClass().getName()을 이용하여
		 해당 데이터가 문자인지 숫자인지 파악해야함
		 */
		
		System.out.println(li.get(2).getClass().getName());
		
	}

}
