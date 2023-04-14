//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public class Abstract1 {

	//추상 클래스 (가상 클래스)
	public static void main(String[] args) {
		box2 b = new box2();
		b.sbox();

	}

}
class box2 extends box {
	@Override
	void sbox() {
		
	}
	@Override
	String result() {
		return null;
	}
}
//abstract : 추상 메소드가 존재하며,
//해당 추상메소드를 사용하지 않을 경우(오버라이드 안할경우) error가 발생
abstract class box {
	abstract void sbox(); //추상 메소드
	abstract String result(); //추상 리턴 메소드
}
