package java1;

public class Array5 {

	public static void main(String[] args) {
		
		/*
		 응용문제3.
		 배열데이터를 모두 합한 배열값을 출력하시오.
		 15 60 11 14 27
		 */
		
		int no[] = {15,60,11,14,27};
		int sum = 0;
//		int w = 0;
//		while(w<no.length) {
//			sum += no[w];
//			w++;
//		}
//		System.out.println(sum);
		
		//for in과 동일한 형태의 배열전용 반복문
		
		for(int f : no) {
			sum += f;
//			System.out.println(f);
		}
		System.out.println(sum);
		
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		/*
		 응용문제4.
		 아이디 데이터 중 4글자 이상인 아이디만 출력하시오.
		 */
		for(String f : id) {
			if(f.length() >= 4) {
				System.out.println(f);
			}
		}
		
		
		
	}

}
