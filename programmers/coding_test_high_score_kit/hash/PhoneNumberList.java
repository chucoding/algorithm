package programmers.coding_test_high_score_kit.hash;

import java.util.Arrays;
import java.util.LinkedList;

public class PhoneNumberList {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){ //j = i+1이 핵심!
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        
        return answer;
    }
	
	public static boolean solution2(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);
		
		//정렬하므로 앞에꺼랑만 비교해주면됨
        for(int i=0; i<phone_book.length; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) {
            	return false;
            }
        }
        
        return answer;
    }
	
	public static boolean solution3(String[] phone_book) {
		boolean answer = true;
        
		//트라이 자료구조 이용
		Try atry = new Try();
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length; i++) {
			if(!atry.Insert(phone_book[i])) {
				answer = false;
				break;
			}
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		
		long beforeTime = 0;

		String[] phone_book = {"119", "97674223", "1195524421"};
		
		beforeTime = System.nanoTime();
		boolean b = solution(phone_book);
		System.out.println(System.nanoTime() - beforeTime);
		
		beforeTime = System.nanoTime();
		boolean b2 = solution2(phone_book);
		System.out.println(System.nanoTime() - beforeTime);
		
		beforeTime = System.nanoTime();
		boolean b3 = solution3(phone_book);
		System.out.println(System.nanoTime() - beforeTime);
	}
}

class Try {

    private TryNode root;

    Try() {

        root = new TryNode('\u0000');
    }

    public boolean search(String word) {

        TryNode temp = root;

        for (char ch : word.toCharArray()) {

            if(temp.terminal)
                return true;
            if (temp.subNode(ch) == null)
                return false;

            temp = temp.subNode(ch);
        }
        boolean ret = temp.terminal;
        char ch = word.charAt(word.length() - 1);

        while(temp != null) {
            temp = temp.subNode(ch);

            if(temp.terminal)
                return true;
        }

        return ret;
    }

    public boolean Insert(String word) {

        if (search(word))
            return false;

        TryNode temp = root;

        for (char ch : word.toCharArray() ) {
            TryNode child = temp.subNode(ch);

            if (child != null) {
                temp = child;
            }
            else {
                temp.list.add(new TryNode(ch));
                temp = temp.subNode(ch);
            }
        }

        return temp.terminal = true;
    }
}

class TryNode implements Comparable<TryNode> {

    char nodeChar;
    boolean terminal;
    LinkedList<TryNode> list;

    TryNode(char nodeChar) {

        this.nodeChar = nodeChar;
        this.terminal = false;
        list = new LinkedList<>();
    }

    public TryNode subNode(char nextChar) {

        if (list != null) {
            for (TryNode eachChild : list)
                if (eachChild.nodeChar == nextChar)
                    return eachChild;
        }

        return null;
    }

    @Override
    public int compareTo(TryNode other) {
        return this.nodeChar > other.nodeChar ? 1 : (this.nodeChar == other.nodeChar ? -1 : 0);
    }
}