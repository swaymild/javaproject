package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Object3 {

	//원시배열 값을 Object 배열로 이관하기
	public static void main(String[] args) {
	
		ob1 ob = new ob1();
		ob.data1();

	}

}

class ob1 {
	ArrayList<Object[]> al; //2차 배열 이상
	Object data[][]; //원시 2차 배열
	//2차 원시 배열 생성시 주의사항 Object를 적용 후 사용해야함
	
	public void data1() {
		this.data = new Object[][] {
				{"hong","kim","park","hong","kang","jang"},
				{2000,5000,4000,2200,3100,4120}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
		System.out.println(Arrays.toString(this.al.get(0)));
		
		/*
		 응용문제1.
		 해당 배열값 중 평균 총 포인트는 얼마인지 결과값을 출력하시오.
		 예시)
		 총 평균 포인트 : 0원 입니다
		 */
//		int w = 0;
		Integer sum = 0;
//		while(w < this.al.get(1).length) { //데이터 갯수만큼 반복
//			sum += (int)this.al.get(1)[w]; //배열 전체금액 모두 더함
//			w++;
//		}
//		System.out.printf("총 평균 포인트 : %d 원입니다",sum/w);
		
		for(Object a:this.al.get(1)) {
			sum += (Integer)a;
		}
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.printf("총 평균 포인트 : %s 원입니다",df.format(sum/al.get(1).length));

	}
	
}
