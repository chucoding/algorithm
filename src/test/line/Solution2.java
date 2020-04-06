package test.line;

public class Solution2 {

	 public static int solution(String answer_sheet, String[] sheets) {
		 int answer = -1;
		 
		 int[][] sheet_arr = new int[sheets.length][answer_sheet.length()];
		 
		 for(int i=0; i<sheets.length; i++) {
			 for(int j=0; j<answer_sheet.length(); j++) {
				 if(answer_sheet.charAt(j) != sheets[i].charAt(j)) {
					 sheet_arr[i][j] = sheets[i].charAt(j) - '0';
				 }
			 }
		 }
		 
		 for(int i=0; i<sheets.length; i++) {
			 for(int j=0; j<sheets[0].length(); j++) {
				 System.out.print(sheet_arr[i][j]);
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 return answer;
	 }
	
	public static void main(String[] args) {
		int a = solution("4132315142",new String[]{"3241523133","4121314445","3243523133","4433325251","2412313253"});
	}
}
