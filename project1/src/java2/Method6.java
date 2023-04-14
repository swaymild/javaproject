//0406 Array13, Random1~2, Method1~6
package java2;

public class Method6 {

	// 배열 데이터를 이용하여 홀수값에 대한 총 갯수 받기
	public static void main(String[] args) {

		mysql m = new mysql();
		String number = m.check("홀수");
		System.out.printf("총 갯수는 %s 입니다", number);

	}

}

// data내용 15 22 17 14 32 35 19 33
class mysql {
	/*
	 * 응용문제3. 협업 프로그래머가 해당 DB(Database)의 값 중 홀수값에 대한 총 갯수를 받고자합니다. 해당 갯수를 출력될 수 있도록
	 * 코드를 작성하시오.
	 */
//	private int data[] = { 15, 22, 17, 14, 32, 35, 19, 33 };
//	int count = 0;
//	String msg;
//	public String check(String notype) {
//		for (int a : data) {
//			if (notype.equals("홀수")) {
//				if (a % 2 == 1) {
//					count++;
//				}
//			} 
//			else if (notype.equals("짝수")) {
//				if (a % 2 == 0) {
//					count++;
//				}
//			}
//		}
//		msg = String.valueOf(count);
//		return msg;
//	}
	
	private int data[];
	
	public String check(String order) {
		int numbers[] = { 15, 22, 17, 14, 32, 35, 19, 33 };
		int count = 0;
		this.data = numbers;
		if(order.equals("홀수")) {
			for(int f: this.data) {
				if(f % 2 != 0) {
					count++;
				}
			}
		}
		return Integer.toString(count);
	}

}
