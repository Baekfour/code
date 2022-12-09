package test1;

import java.util.ArrayList;
import java.util.List;

public class ThreeToTen {
	
	//commit한다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> toThreeReverse = findThree(125);
		int listSize = toThreeReverse.size()-1;
		int answer = 0;
		for(int i = 0; i < toThreeReverse.size(); i ++) {
			answer = answer + ((int) Math.pow(3, listSize) * toThreeReverse.get(i));
			listSize -= 1;
		}
		System.out.println(answer);
	}
	
	public static List<Integer> findThree(int n) {
		List<Integer> toThree = new ArrayList<>();
		int a = n;
		int b = 0;
		while(true) {
			b = a%3;
			a = a/3;
			toThree.add(b);
			if(a == 0) {
				break;
			}
		}
		return toThree;
	}

}
