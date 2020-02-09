package programmers.coding_test_high_score_kit.hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	//식이 잘 이해가 안감
	 public static int solution(String[][] clothes) {
	     int answer = 0;
	     
	     Map<String, Integer> map = new HashMap();
	     
	     for(int i=0; i<clothes.length; i++) {
	    	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
	     }

	     if(map.size() == 1) answer = clothes.length;
	     else {

		     int typeCnt = 1;
		     
		     for(String key : map.keySet()) {
		    	 typeCnt *= map.get(key)+1;
		     }
		     
		     answer = typeCnt-1;
	     }
	     
	     return answer;
	 }
	 
	 public static void main(String[] args) {
		 
		 String[][] clothes = {{"yelow_hat","headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		 String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
				 
		 int cnt = solution(clothes);
		 int cnt2 = solution(clothes2);
		 
		 System.out.println(cnt);
		 System.out.println(cnt2);
	}
}
