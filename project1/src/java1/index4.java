//0331 index1 ~ index4
package java1;

public class index4 {

	public static void main(String[] args) {

		//반복문 사용
		int f = 1;
		for(f=1;f<=10;f++) {
			System.out.println(f);
		}
		
		//더블for문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		/*
		 응용문제2.
		 숫자 45~60까지 총 합산한 결과값을 출력하시오.
		 */
		int c;
		int d=0;
		for(c=45;c<=60;c++) {
			d+=c;
		}
		System.out.printf("45~60의 합산값 : %d\n",d);
		
		/*
		 응용문제3.
		 1~200까지 숫자 중 홀수값만 모두 더한 결과값을 출력하시오.
		 */
		int e;
		int g=0;
		for(e=1;e<=200;e++) {
			if(e % 2 == 1) {
				g+=e;
			}
		}
		System.out.println(g);
		
		/*
		 응용문제4.
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후 짝수인지
		 홀수인지 출력하시오.
		 */
		int h;
		int i = 0;
		for(h=20;h<=60;h++) {
			if(h % 3 == 0) {
				i+=h;
			}
		}
		if(i % 2 == 0) {
			System.out.printf("%d 짝수입니다.\n",i);
		}
		else {
			System.out.printf("%d 홀수입니다.\n",i);
		}
		
		/*
		 응용문제5.
		 구구단 7단부터 3단까지 역순으로 출력하시오.
		 단, 그 중 결과값이 홀수인 값만 출력하시오.
		 */
		
		int j,k,l;
		
		for(j=7;j>=3;j--) {
			for(k=9;k>=1;k--) {
				l = j * k;
				if(l % 2 == 1) {
					System.out.printf("%d*%d=%d\n",j,k,l);
				}
			}
		}
		
	}

}
