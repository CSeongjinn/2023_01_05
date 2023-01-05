package arrayList01;

import java.util.ArrayList;
import java.util.Collections;

public class AL01 {
	public static void main(String[] args) {
		//<>제네릭, 1.5때 추가됨. 내부 타입 요소 지정
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//값 추가 .add(); 
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(99);
		list.add(85);
		list.add(75);
		
		//값 출력
		System.out.println(list);
		
		//.get(index);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Integer integer:list) {
			System.out.println(integer);
		}
		
		//size()
		System.out.println(list.size());
		
		//list의 마지막 데이터 출력
		System.out.println(list.get(list.size()-1));
		
		//1~20 짝수만 순서대로 저장
		ArrayList<Integer> least = new ArrayList<Integer>();
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				least.add(i);
			}
		}
		System.out.println(least);
		least.remove(0);
		System.out.println(least);
		
		least.clear();//초기화
		System.out.println(least.size());
		System.out.println(least);
		for(int i=1;i<=20;i++) least.add(i);
//		for(int i=20;i>0;i--) {
//			if(i%2==1) {
//				least.remove(i-1);
//			}
//		}
//		for (int i = least.size() - 2; i >= 0; i-=2) {
//	         least.remove(i);
//	      }
//		for (int a = 0; a < least.size(); a++) {
//	          least.remove(a);
//	       }
		int i =0;
		while(i<least.size()) {
			if(least.get(i)%2==0) {
				i++;
			}
			else {
				least.remove(i);
			}
		}
		System.out.println(least);
		//least.add(0,100);
		System.out.println(least);
		System.out.println(least.size());
		
		for(int a=0;a<least.size();a+=2) least.add(a,a+1);
		System.out.println(least);
		
		//값의 존재 여부
		System.out.println(least.contains(10));
		
		//비어있는가
		System.out.println(least.isEmpty());
		
		//일부
		System.out.println(least.subList(0, 10));
		
		//셔플
		Collections.shuffle(least);
		System.out.println(least);
		
		//정렬
		Collections.sort(least);
		System.out.println(least);
		
		//내림차순정렬
		Collections.sort(least,Collections.reverseOrder());
		System.out.println(least);
		
		//값의 위치를 반환, 없으면-1
		System.out.println(least.indexOf(15));
	}
}
