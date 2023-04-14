//0411 Method11~18, Over1~3, Sleep, Awt1, Abstract1
package java2;

public class Method18 extends data {
	
	//main은 override를 사용할 수 없음
	public static void main(String[] args) {
		
		md m = new md();
		m.display();
		Method18 mh = new Method18();
		mh.name();
	}
	@Override //원본 메소드를 그대로 상속 (오버라이딩)
	public void name() {
		int aa = 10; //오버로딩 : 기본 메소드 코드 외에 추가된 코드
		System.out.println(this.abc); //오버로딩
		super.name();
		System.out.println("추가 코드 작성"); //오버로딩
	}
	
}

class md extends pt { //pt : Method17에 있는 메소드
	@Override
	public void display() { //오버라이드 실행
		super.display();
	}
}
class data {
	String abc = "홍길동";
	public void name() {
		System.out.println("외부 클래스 데이터 로드");
	}
}
