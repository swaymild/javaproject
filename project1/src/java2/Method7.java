//0410 Example1~10(mssql), Method7~10
package java2;

public class Method7 {

	//상속 메소드 (extends)
	public static void main(String[] args) {
		
		box2 b = new box2();
		b.list();
		b.list2();

	}

}

class box1 { //외부 box1 class
	public String user_id;
	private String user_pw; //private는 상속하지 못하는 변수선언
	public void list() {
		this.user_id = "hong";
	}

	//private를 직접 핸들링 못하므로 return을 이용해 핸들링함(box2)
	public String pw() { //getter
		this.user_pw = "a123456";
		return this.user_pw;
	}
}

//extends : box1을 상속받아서 box2에서 진행
//상속을 이용할 경우 같은 메소드 이름을 사용하지않음
class box2 extends box1 { 
	public void list2() {
		String pass = this.pw(); //box1에서 return메소드로 값을 가져옴
		System.out.println(pass);
		System.out.println(this.user_id);
	}
}