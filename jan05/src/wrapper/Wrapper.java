package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//랩퍼클래스
//능력단위 : (비NCS)웹표준 기술
//능력단위요소 : (비NCS)웹표준 기술

/*
 * 자료구조?
 * 컬렉션은 참조값(reference type)만 담을 수 있다
 * 
 * * p타입은 저장할 수 없다.
 * 그래서 랩퍼 클래스로 변환 후 저장한다
 * 
 * 기본 자료형의 값을 컬렉션에 저장하기 위해서 사용한다
 * 모든 기본 자료형에 대해 그에 대응되는 랩퍼 클래스가 있다
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고 해서
 * 랩퍼(Wrapper,)클래스라고 불린다
 * 
 * 기본타입			랩퍼클래스명
 * byte				Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * 프로모션
 */
public class Wrapper {
	public static void main(String[] args) {
		Byte b = new Byte((byte)127);
		Byte b2 = 127;
		
		Integer iNum = new Integer(127);
		Integer iNum2 = 127; //오토박싱 <->언박싱
		
		byte bNum = iNum2.byteValue(); //캐스팅이 아닙니다
		short sNum = iNum2.shortValue();
		float fNum = iNum2.floatValue();
		
		iNum= Integer.MAX_VALUE;
		iNum2= Integer.MIN_VALUE;
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(fNum);
		System.out.println(iNum);
		System.out.println(iNum2);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE/Byte.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE/Byte.MAX_VALUE);
		
		//오토박싱
		Integer iNum3 = 127;
//->	Integer iNum3 = new Integer(127);
		Integer iNum4 = new Integer(127);	//형변환이 아닌 기본타입이 참조타입으로 바뀌는것
		
		if(iNum3 == iNum4)System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println(iNum3.equals(127));//같으면 true, 다르면 false
		System.out.println(iNum3.compareTo(127));//같으면 0, 앞이크면 1 뒤가 크면 -1
		
		
		//오토 언박싱
		int number = iNum3; //int number = iNum3.intValue();
		//iNum3이 참조하고 있는 객체 안에 있는 int값이
		//객체 밖으로 나와 number에 들어간다
		System.out.println(number);
		
		Object obj = 10;
		System.out.println(obj);
		
//		int result = obj; //obj는 랩퍼클래스가 아니기때문에 안됨
		int result = (int)obj;
		System.out.println(result);
		
		result = (Integer)obj;
		result = ((Integer)obj).intValue();
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map;
	}
}
