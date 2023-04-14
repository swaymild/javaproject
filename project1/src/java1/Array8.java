package java1;

import java.util.Arrays;

public class Array8 {

	//배열합치기 응용
	public static void main(String[] args) {
		
		/*
		 응용문제7.
		 데이터배열 2가지가 있음. 해당 데이터배열을 다음 결과처럼 값을 출력시키시오
		 1번 DATA : 대한민국 일본 중국 베트남 태국
		 2번 DATA : 40 35 70 55 32
		 ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 */
		
		String data1[] = {"대한민국","일본","중국","베트남","태국"};
		int data2[] = {40,35,70,55,32};
		String data3[] = new String[data1.length];
		
		int count = 0;
		for(String f:data1) {
//			data3[count] = f+"("+String.valueOf(data2[count])+")";
//			data3[count] = f+"("+Integer.toString(data2[count])+")";
			data3[count] = f+"("+data2[count]+")";
			count++;
		}
		System.out.println(Arrays.toString(data3));

	}

}
