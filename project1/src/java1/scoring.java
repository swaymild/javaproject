//0405 Array1~12, Class_array1~2(Data1,Scoring)
package java1;

public class scoring {
	//배열값 및 사용자가 검색한 단어 인자값으로 받음
	public void sc(String a[],String b[],String c) {
		
		int w= 0;
		int count = 0;
		while(w<a.length) {
			if(c.equals(a[w])) { //검색단어와 배열값 비교
				System.out.printf("%s님은 %s점입니다",c,b[w]);
				count++;
			}
			w++;
		}
		if(count == 0) { //검색단어에 배열값이 없을 경우
			System.out.println("해당 사용자의 정보가 존재하지않습니다");
		}
	}
	
}
