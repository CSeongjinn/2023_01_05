package enum01;
//Enum : 열거타입
//열거한 데이터만 쓸 수 있습니다
//같은 값은 가질 수 없다
//enum은 클래스명과 중복할 수 없다
enum Week{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class Enum01 {
	public static void main(String[] args) {
		Week week = Week.FRI;
		System.out.println(week);
		var number = 10;//java 10버전에 도입된 변수 var
		//값으로 데이터 타입을 추론합니다. 지역변수로만 가능
		//꼭 초기화 후 사용, null초기화 안됨, 배열사용불가
		System.out.println(number);
		
		var name = "홍길동";
		String str = name;
		
		//레코드를 하려 했으나 자바 14에 추가됨 11을 쓰고있어서 지금 안됨
	}
}
