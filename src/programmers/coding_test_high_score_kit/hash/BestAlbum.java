package programmers.coding_test_high_score_kit.hash;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BestAlbum {

	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Map<Integer, Integer>> map = new HashMap();
        
        for(int i=0; i<genres.length; i++) {
        	if(map.get(genres[i]) != null) {
        		map.get(genres[i]).put(i, plays[i]);
        	} else {
        		Map<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
        		playsMap.put(i, plays[i]);
        		map.put(genres[i], playsMap);
        	}
        }
        
        for(String genre : map.keySet()) {
        	Map<Integer,Integer> playsMap = map.get(genre);
        	
        	int sum = 0;
        	for(Integer playIndex : playsMap.keySet()) {
        		sum += map.get(genre).get(playIndex);
        	}
        	
        	List<Map.Entry<Integer, Integer>> list = new LinkedList<>(playsMap.entrySet());
        	Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){

				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					 int comparision = (o1.getValue() - o2.getValue()) * -1;
		             return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
				}
				
            });
        	
        }
        
        System.out.println(map);
        

    	
        
        
       
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] arr = solution(genres, plays);
	}
}
