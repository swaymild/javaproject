//0412 Abstract2~
package java3;

public class Abstract2 {

	//ab1 연계
	public static void main(String[] args) {
		
		box3 b = new box3();
		b.idck("hong");
//		aa r = new aa(); //법칙1 에러
		b.result();

	}

}

//abstract(추상) : 상속을 강제하는 일종의 규제. 즉 법칙을 제공하는 클래스
//추상클래스를 상속하면 무조건 추상클래스 안의 메소드를 오버라이드해야함
/*
 추상클래스의 법칙(무분별한 클래스와 메소드 생성을 막기위함)
 1. main에서 추상 메소드를 직접 핸들링할 수 없음
 2. 추상클래스는 상속 위주로 사용함
 3. 추상클래스에 별도의 코드를 작성하지 않음(if, for등 X)
 4. 필드에 변수를 선언 및 값을 적용할 수 있음
 5. 추상클래스 안에 실제 메소드를 생성시 사용하지 않아도됨 (오버라이드 X)
 6. 추상클래스는 직접 실행 안됨
 7. 추상클래스는 추가 상속이 가능
 */
class box3 extends ab1 {
	@Override
	public void result() {
		System.out.println(this.aa1);
	}
	
	@Override
	public void idck(String id) {
		System.out.println(id);
	}
	
	@Override
	public String loginck() {
		return null;
	}
}
