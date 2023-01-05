package is_a_has_a;
//클래스의 관계
//is a, has a
/*
 * is a= ~은 ~이다.
 * 
 * has a: ~은 ~을 가지고 있다
 */
class Human{
	String name;
	int age;
	int gender;
}
//이 상속관계에서는 학생이 사람을 상속받고 있습니다.
//학생은 사람이다가 성립됩니다 이런 관계를 is a 관계라고 합니다
class Student extends Human{
	int number;
	String major;
}
class Gun{
	String name;
	int shot;
}
//has a : 경찰은 총을 가지고 있습니다
//경찰 클래스 속에 총 클래스의 객체를 멤버로 가지고 있는 경우
class Police{
	Gun gun;
}
public class Is {
	public static void main(String[] args) {
		Police police = new Police();
		police.gun = new Gun(); //그래서 만들어줌
		police.gun.name = "리볼버";//"police.gun" is null
		//먼저 건을 만들어서 경찰에게 줘야 합니다.
	}
}
