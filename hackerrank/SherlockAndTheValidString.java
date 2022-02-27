package hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndTheValidString {

	// Complete the isValid function below.
    static String isValid(String s) {

    	Map<Character, Integer> map = new HashMap<Character, Integer>();

    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		map.put(ch, map.getOrDefault(ch,0)+1);
    	}

    	Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    	for(char key : map.keySet() ){
    		int val = map.get(key);
    		map2.put(val, map2.getOrDefault(val,0)+1);
        }
    	
    	if(map2.size()>2) s = "NO";
    	else if(map2.size() == 1) s = "YES";
    	else {
    		int[] arr = new int[2];
    		int i=0;
    		for(int key : map2.keySet() ){
    			arr[i++] = key;
    		}
    		if((Math.abs(arr[0] - arr[1]) == 1 || arr[0] == 1 || arr[1] == 1) && (map2.get(arr[0]) == 1 || map2.get(arr[1]) == 1)) s = "YES";
    		else s = "NO";
    	}
    	return s;
    }

    private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
	}
}
