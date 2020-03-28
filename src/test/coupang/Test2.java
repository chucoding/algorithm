package test.coupang;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test2 {

	public static long solution(int[][] goods, int[][] coupons) {
		long answer = 0;
		
		Map<Integer, Integer> goodsMap = new HashMap();
		Map<Integer, Integer> couponsMap = new HashMap();
		
		Integer[] goodsArr = new Integer[goods.length];
		Integer[] couponsArr = new Integer[coupons.length];
		
		for(int i=0; i<goods.length; i++) {
			goodsMap.put(goods[i][0],goodsMap.getOrDefault(goods[i][0],0)+goods[i][1]);
			goodsArr[i] = goods[i][0];
		}
		
		for(int i=0; i<coupons.length; i++) {
			couponsMap.put(coupons[i][0],coupons[i][1]);
			couponsArr[i] = coupons[i][0];
		}

		Arrays.sort(goodsArr, Collections.reverseOrder());
		Arrays.sort(couponsArr, Collections.reverseOrder());

		Queue<Integer> a = new LinkedList();
		
		for(int i=0; i<couponsArr.length; i++) {
			a.offer(couponsArr[i]);
		}
		
		int total = 0;
		for(int i=0; i<goodsArr.length; i++) {
			
			for(int j=0; j<goodsMap.get(goodsArr[i]); j++) {
				
				total++;
				int coupon = a.poll();
				double sales = (100 - coupon) / 100.0;
				answer += goodsArr[i] * sales;
				
				couponsMap.put(coupon,couponsMap.get(coupon)-1);
				if(couponsMap.get(coupon) != 0) a.offer(coupon); 
				
//				double sales = (100 - couponsArr[j%couponsArr.length]) / 100.0;
//				answer += goodsArr[i] * sales;
//				
//				couponsMap.put(couponsArr[j%couponsArr.length],couponsMap.get(couponsArr[j%couponsArr.length])-1);
//				System.out.println(couponsMap);
//			
			}
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[][] {{25400,2},{10000,1},{31600,1}}, new int[][] {{5,3},{23,2},{11,2},{9,5}});
	}
}
