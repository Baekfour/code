package test1;

import java.util.ArrayList;
import java.util.List;

public class naejuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		List<Integer> c = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			c.add(a[i] * b[i]);
		}
		int answer = 0;
		
		for(int k : c) {
			answer = answer + k;
		}
		System.out.println(answer);
	}

}
