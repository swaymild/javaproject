package java1;

public class Double2 {

	public static void main(String[] args) {

		/*
		 응용문제6.
		 구구단 9단 중 9*64까지 숫자 중
		 홀수값에 대한 평균값 결과를 출력 하시오.
		 */
		
		int a = 9;
		int b = 1;
		int c = 64;
		int count = 0;
		int sum;
		int sum2 = 0;
		
		while(b<=c) {
			sum = a * b;
			if(sum % 2 == 1) {
				count++;
				sum2+=sum; 
			}
			b++;
		}
		System.out.printf("%d*1 ~ %d*%d의 결과값 중 홀수값 총합의 평균은 %d",a,a,c,sum2/count);

	}

}
