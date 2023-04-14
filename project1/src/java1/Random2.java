//0406 Array13, Random1~2, Method1~6
package java1;

import java.util.Arrays;

public class Random2 {

	//random으로 활용법
	public static void main(String[] args) {
		
		/*
		 응용문제1.
		 pc가 1~46까지의 숫자 6개를 무작위로 생성
		 해당 6개 숫자를 배열화하여 출력하시오.
		 */
		
		int w = 0;
		String lotto = "";
		int pc;
		while(w<6) {
			pc = (int)Math.ceil(Math.random()*46);
			lotto += pc+" ";
			w++;
		}
		String lottoarray[] = lotto.split(" ");
		System.out.println(Arrays.toString(lottoarray));
		
		int number[] = new int[6];
		int f;
		for(f=0;f<6;f++) {
			int pc2 = (int)Math.ceil(Math.random()*46);
			number[f] = pc2;
		}
		System.out.println(Arrays.toString(number));
		
		
	}

}
