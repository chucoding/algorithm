package programmers.coding_test_high_score_kit.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class BestAlbum2 {

	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        List<Integer> answerList = new ArrayList<Integer>();
        HashMap<String, Integer> genrePlayHashMap = new HashMap<String, Integer>();
        
        for(int i=0; i<genres.length; i++) {
        	genrePlayHashMap.put(genres[i], genrePlayHashMap.getOrDefault(genres[i], 0)+plays[i]);
        }
        
        Set<String> key = genrePlayHashMap.keySet();
        
        //플레이수 : 장르를 담을 해쉬맵
        HashMap<Integer, String> playGenreHashMap = new HashMap<Integer, String>();
        for(String k : key) {
        	playGenreHashMap.put(genrePlayHashMap.get(k),k);
        }
        
        //플레이수 : 장르 오름차순
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(playGenreHashMap);
        
        int treeMapSize = treeMap.size();
        for(int i=0; i<treeMapSize; i++) {
        	String genre = treeMap.lastEntry().getValue();
        	int deleteKey = treeMap.lastEntry().getKey(); //TreeMap 지울때 사용
        	int max = -1, nextmax = -1;
        	int maxIndex = -1, nextmaxIndex = -1;
        	
        	//해당 장르에서 가장 큰놈, 둘째놈 list에 넣기
        	for(int g=0; g<genres.length; g++) {
        		if(genres[g].equals(genre)) {
        			//check
        		}
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
