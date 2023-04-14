package java3;

import java.util.Arrays;
import java.util.Comparator;

public class Abstract4 {

	public static void main(String[] args) {
		/*
		 1차 배열 값이 있습니다. 해당 배열값 리스트를 오름차순으로
		 정렬하며, 해당 모든 배열 값을 더한후 최종 결과값을 출력하는
		 코드를 작성하시오(제한시간 10분)
		 배열데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
		 */
		qst q = new qst();
		q.datalist();
		q.result();

	}

}

class qst extends sum_total {
	Integer no[] = {1,10,15,19,8,4,7,0,2,3,9,12};
	
	@Override
	public void datalist() {
//		Arrays.sort(this.no); //오름차순 정렬
		Arrays.sort(this.no,Comparator.reverseOrder()); //내림차순(Integer,String)
		//Comparator : java8 버전, Collections : java 7 이하버전
		
		System.out.println(Arrays.toString(this.no));
	}
	@Override
	public void result() {
		this.sum = 0;
		for(int a:this.no) {
			this.sum += a;
		}
		System.out.println(this.sum);
	}
}
