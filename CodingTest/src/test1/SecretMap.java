package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//완료
		System.out.println(findTwo(6, 46));
		System.out.println(findTwo(6, 27));
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		String a[] = solution(n, arr1, arr2);
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {

        List<String> list = new ArrayList<>();
		String shap ;
		// arr1,2의 숫자 모두 비교
        for(int i = 0; i < n; i++) {
        	shap = "";
        	List<Integer> arr1Sub =  findTwo(n, arr1[i]);
        	List<Integer> arr2Sub = findTwo(n, arr2[i]);
        	for(int j = 0; j < n; j++) {
            	if(arr1Sub.get(j) == 0 && arr2Sub.get(j) == 0) {
            		shap = shap + " ";
            	} else {
            		shap = shap + "#";
            	}
        	}
        	list.add(shap);
        }

        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
    // 한 수에 대한 2진법 구하는 method
	public static List<Integer> findTwo(int n, int oneArray) {
		List<Integer> toTwo = new ArrayList<>();
		int a = oneArray;
		int b = 0;
		while(true) {
			b = a%2;
			a = a/2;
			toTwo.add(b);
			if(a == 0) {
				break;
			}
		}
		for(int i = 0; i < n; i++) {
		if(toTwo.size() != n) {
			toTwo.add(0);
		}
		}
		// 배열형태로 2진법 완성
		Collections.reverse(toTwo);
		return toTwo;
	}
    
}
