package programmers.coding_test_high_score_kit.hash;

import java.util.Arrays;

public class PhoneNumberList {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        
        return answer;
    }
	
	public static boolean solution2(String[] phone_book) {
		boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        
        return answer;
    }
	
	public static boolean solution3(String[] phone_book) {
		boolean answer = true;
        
		Solution3 solution3 = new Solution3();
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length; i++) {
			if(!solution3.insert(phone_book[i])) {
				answer = false;
				break;
			}
		}
		return answer;
    }
	
	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean b = solution(phone_book);
		boolean b2 = solution2(phone_book);
		boolean b3 = solution3(phone_book);
	}
}

class Solution3 {
	
}