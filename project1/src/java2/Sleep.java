//0411 Method11~18, Over1~3, Sleep, Awt1, Abstract1
package java2;

public class Sleep {
	
	//시간 타이머
	public static void main(String[] args) {
		try {
		int w = 0;
		while(w < 101) {
			Thread.sleep(1000); //1초에 한번씩 반복하는 형태
			//Thread : 프로세스가 실질적으로 작업하는 단위
			System.out.println(w);
			w++;
		}
		}catch(Exception e) {
			
		}

	}

}
