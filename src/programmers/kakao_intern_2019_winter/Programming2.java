package programmers.kakao_intern_2019_winter;

public class Programming2 {

	public static int[] solution(String s) {
        int[] answer = {};

        s = s.substring(2, s.length()-2 );
        String[] array = s.split("\\},\\{");
        
        int max_count = 0;
        String st = "";
        
        for(String a : array) {
        	
        	int count = 0;
        	for(int i=0; i<a.length(); i++) {
        		if(a.charAt(i) == ',') count++;
        	}
        	
        	if(max_count < count) {
        		max_count = count;
        		st = a;
        	}
        }
        
        answer = new int[array.length]; 
        String[] arr = st.split(",");

        for(int i=0; i<arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
	
	public static void main(String[] args) {
//		solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
//		solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
		solution("{{20,111},{111}}");
	}
}
