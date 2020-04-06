package programmers.coding_test_high_score_kit.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BestAlbum {

	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        Map<String,Integer> genresMap = new HashMap<String, Integer>();
        
        //장르별 많이 팔린대로 묶기
        for(int i=0; i<genres.length; i++) {
        	genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0)+plays[i]);
        }
 
        //장르 정렬
        List<Map.Entry<String, Integer>> sortList = new LinkedList<>(genresMap.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int comparision = (o1.getValue() - o2.getValue()) * -1;
    			return comparision;
			}
        });
        
        // 순서유지를 위해 LinkedHashMap을 사용
        Map<String, Integer> sortedMap = new LinkedHashMap<>(); 
        for(Iterator<Map.Entry<String, Integer>> iter = sortList.iterator(); iter.hasNext();){
            Map.Entry<String, Integer> entry = iter.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        Map<String, Map<Integer, Integer>> map = new HashMap<String, Map<Integer, Integer>>();
        
        for(int i=0; i<genres.length; i++) {
        	if(map.get(genres[i]) != null) {
        		map.get(genres[i]).put(i, plays[i]);
        	} else {
        		Map<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
        		playsMap.put(i, plays[i]);
        		map.put(genres[i], playsMap);
        	}
        }
        
        answer = new int[map.size()*2];
        int i = 0;
        
        for(String genre : map.keySet()) {
        	Map<Integer,Integer> playsMap = map.get(genre);
        	List<Map.Entry<Integer, Integer>> list = new LinkedList<>(playsMap.entrySet());
        	Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){

        		@Override
        		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
        			int comparision = (o1.getValue() - o2.getValue()) * -1;
        			return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
        		}
        	});
        	
        	for(int j=0; j<2; j++) {
        		answer[i] = list.get(j).getKey();
        		i++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] arr = solution(genres, plays);
	}
}
