package arrayList01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
//		list.add(11.1);
//		list.add("홍길동");
		int num = list.get(0);
		
		
		//리스트를 새로 만들어주세요.
		//랜덤(1~45) 숫자가 나오면 
		//크기 순서대로 저장하는 메소드를 만들어 주세요
		//랜덤은 6번만 실행해주세요
		
		List<Integer> rList = new ArrayList<Integer>();
//		for(int i=0;i<6;i++) {
//			int r = (int)(Math.random()*45)+1;
//			int j=0;
//			if(rList.indexOf(r)!=-1) {
//				i--;
//			}
//			else {
//				while(j<rList.size()) {
//					if(r>rList.get(j)) j++;
//					else break;
//				}
//				rList.add(j,r);
//			}
//		}		
		ArrayList<Integer> sel = new ArrayList<Integer>();
		for(int i=1;i<=45;i++) sel.add(i); 
		for(int i=0;i<6;i++) {
			int j =0;
			int r = (int)(Math.random()*sel.size());
			while(j<rList.size()) { 
				if(sel.get(r)>rList.get(j)) j++;
				else break;
			}
			rList.add(j,sel.get(r));
			sel.remove(r); 
		}
		
	
//		while(rList.size()<6) {
//			int ra = (int)(Math.random()*45+1);
//			int index=0;
//			if(rList.indexOf(ra)==-1) {
//				while(index<rList.size()) {
//					if(rList.get(index)<ra) index++;
//					else break;
//				}
//				rList.add(index,ra);				
//			}
//		}
		System.out.println(rList);
	}
}
