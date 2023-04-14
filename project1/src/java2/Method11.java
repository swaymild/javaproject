//0411 Method11~18, Over1~3, Sleep, Awt1, Abstract1
package java2;

public class Method11 {

	//상속 메소드 형태2
	public static void main(String[] args) {
		
		student st = new student();
		st.info("홍길동", "30");
		st.print();
	}

}

class person {
	protected String name; 
	protected String age;
	//protected : 같은 클래스 및 상속클래스 모두 접근 가능(같은 패키지 사용)
	//단,외부 별도의 클래스에서 접근 안됨
	
	//setter
	public void info(String name,String age) {
		this.name = name;
		this.age = age;
	}
	public void print() { //print라는 메소드를 생성
		System.out.println("고객명: "+this.name);
	}
}

class student extends person {
	
	@Override //동일한 이름과 인자값을 가진 메소드를 표시
	public void print() {
		super.print(); //상속받는 메소드를 정의함(값, 처리사항)
		System.out.println("나이: "+this.age);
	}
	
}
