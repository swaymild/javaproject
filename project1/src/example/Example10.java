//0410 Example1~10(mssql), Method7~10
package example;
import java2.mssql;

public class Example10 {

	public static void main(String[] args) {
		
		mssql ms = new mssql();
		ms.abc(); //외부 메소드 로드
		//외부 메소드 메인 로드(외부 java 파일 가져올시 main은 로드하지않음)
//		ms.main(args); 
		String result = ms.bbb();
		System.out.println(result);
		
	}

}
