package java1;

import java.util.Arrays;

public class Array9 {
	
	//2차 배열 구조 및 출력
	/*
	 정적배열 : 
	 int a[] = new int[2];
	 a[0] = 1;
	 a[1] = 2;
	 
	 동적배열 : 
	 int a[] = {1,2,3};
	 int[] a = {1,2,3};
	 int[] a = new int[]{1,2,3}
	 */
	public static void main(String[] args) {
		
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
//		System.out.println(Arrays.toString(member[0]));
//		System.out.println(member[0][2]);
		
		int count = 0;
		for(String[] a:member) {
			for(String b:member[count]) {
				System.out.println(b);
				System.out.println(Arrays.toString(a));
			}
			count++;
		}

	}

}
