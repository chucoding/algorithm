package test;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {8,3,1,2,4,5,6,7};
	
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);
				System.out.println(o1+" "+o2);
				System.out.println();
				return o1-o2;
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
