package test.kakao_intern;

import java.util.Stack;

public class Programming1 {

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> move_stack = new Stack<Integer>();
        Stack<Integer>[] board_stack = new Stack[board.length];
        
        for(int i=0; i<board.length; i++) {
        	board_stack[i] = new Stack<Integer>();
        	for(int j=board[i].length-1; j>=0; j--) {
        		if(board[j][i] == 0) break;
        		board_stack[i].add(board[j][i]);
        	}
        }
        
        for(int i=0; i<moves.length; i++) {
        	if(board_stack[moves[i]-1].isEmpty()) continue;

        	if(move_stack.isEmpty()) move_stack.add(board_stack[moves[i]-1].pop());
        	else {
        		if(board_stack[moves[i]-1].peek() == move_stack.peek()) {
        			board_stack[moves[i]-1].pop();
        			move_stack.pop();
        			answer+=2;
        		} else {
        			move_stack.add(board_stack[moves[i]-1].pop());
        		}
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
	}
}
