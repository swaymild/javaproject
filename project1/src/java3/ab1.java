//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;
//Abstract4
abstract class sum_total {
	public int sum;
	public abstract void datalist();
	public abstract void result();
}
//-------------------------------------------

//main class가 없어야함
public abstract class ab1 {
	public int aa1 = 30;
	
	public abstract String loginck();
	public abstract void idck(String id);
	public abstract void result();
	public void ab_1() { //추상 클래스에 실제 메소드
		
	}
	
}

//외부 가상 class를 만들기 위해서는 public을 사용하지않음
abstract class aa {
	public abstract int password(); //가상 메소드 생성
}

abstract class aa2 extends aa { //추상 클래스끼리 상속받음
	//단, 추상 클래스는 오버라이드 하지않음
	public abstract String user_info();
}

//일반 클래스 메소드
class aa3 {
	public String aa3_method() {
		return null;
	}
}

//------------------------------  OOP4  ----------------------------------------------
abstract class Userinfo2 {
	String member[][] = {
			{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
	};
	abstract void point();
}