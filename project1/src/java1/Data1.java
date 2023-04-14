//0405 Array1~12, Class_array1~2(Data1,Scoring)
package java1;

// 해당 파일은 실행권한이 없음 class_array1.java에서 실행해야함
public class Data1 {
	String user[] = {"hong","kim","park"};
	//전역 배열변수 작성
	int number = 0;
	
	public void userlist() {
//		String[] user = {"hong","kim","park"};
		int w = 0;
		while(w<user.length) {
			System.out.println(user[w]); //반복문으로 배열값 출력
			w++;
		}
		this.number = 100; //this : 전역변수를 지칭
		
	}
	
}
