package test.coupang;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {

	public static long solution(int[][] goods, int[][] coupons) {
		long answer = 0;
		
		Map<Integer, Integer> goodsMap = new HashMap();
		Map<Integer, Integer> couponsMap = new HashMap();
		
		//쿠폰 전용 큐
//		PriorityQueue<Integer> couponsQueue = new PriorityQueue(Collections.reverseOrder());
		Queue<Integer> couponsQueue = new LinkedList();
		
		for(int i=0; i<goods.length; i++) {
			goodsMap.put(goods[i][0],goodsMap.getOrDefault(goods[i][0],0)+goods[i][1]);
		}
		
		for(int i=0; i<coupons.length; i++) {
			couponsMap.put(coupons[i][0],coupons[i][1]);
//			for(int j=0; j<coupons[i][1]; j++) {
				
//			}
		}
		
		//해시맵 정렬
		TreeMap<Integer, Integer> goodsTm = new TreeMap<Integer,Integer>(goodsMap);
		Set<Integer> goodsKeyset = goodsMap.keySet();
		Iterator<Integer> goodsKeyiterator = goodsTm.descendingKeySet().iterator();
		
		TreeMap<Integer, Integer> couponsTm = new TreeMap<Integer,Integer>(couponsMap);
		Set<Integer> couponsKeyset = couponsMap.keySet();
		Iterator<Integer> couponsKeyiterator = couponsTm.descendingKeySet().iterator();

		//쿠폰 우선순위
		while(couponsKeyiterator.hasNext()) {
			couponsQueue.offer(couponsKeyiterator.next());
		}
		
//		System.out.println(couponsQueue);
		
		for(int i=0; i<goodsTm.size(); i++) {
			int key = goodsKeyiterator.next();
			
			for(int j=0; j<goodsTm.get(key); i++) {
				System.out.println(key);
//				int coupon = 0;
//				
//					coupon = couponsQueue.poll();
//					answer += key * ( (100 - coupon) / 100);
//					couponsMap.put(coupon,couponsMap.get(coupon)-1);
//					if(couponsMap.get(coupon) != 0) couponsQueue.offer(coupon);
//				
//				if(couponsQueue.isEmpty()) break;
				
				
				
//				int coupon = couponsQueue.poll();
//				while(couponsQueue.poll() == couponsQueue.peek()) {
//					couponsQueue.poll();
//					couponsQueue.offer(e)
//				}
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[][] {{25400,2},{10000,1},{31600,1}}, new int[][] {{5,3},{23,2},{11,2},{9,5}});
	}
}
