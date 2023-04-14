package java1;

public class Class4 {

	public static void main(String[] args) {

		/*
		 응용문제4.
		 static이 없는 class이며, 해당 class에 두개의 숫자를 인자값으로
		 보냅니다. 해당 두개의 숫자 범위 안에 모든 값을 더하여 결과값을 받아서
		 출력하는 코드를 작성하시오.
		 */
		Reno re = new Reno(); //외부 클래스 객체 생성
		int no = re.abc(4,8); //해당 클래스에 두 인자값 전달 및 return으로 확인
		System.out.println(no);

	}

}

class Reno { //같은 package 안에 동일한 class는 사용하지 못함
	public int abc(int a,int b) { //문자 사용 X
		int sum = 0;
		while(a<=b) { //반복문으로 해당 범위값 모두 합산
			sum += a;
			a++;
		}
		return sum; //최종값 return
		
	}
}

