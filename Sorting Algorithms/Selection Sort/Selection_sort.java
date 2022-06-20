package javacode.sort;

import java.util.Arrays;

public class Selection_sort {
	public  void Select_sorted(int array[]) {
		int i,j, min_index;
		int n = array.length;
		
		for (i = 0; i < n-1; i++) {
			min_index = i;
			for (j = i+1; j < n; j++) {
				if(array[min_index]>array[j]) {
					min_index = j;	
				}
			}
			// after for loop for j swap array[i] & array[min_index]
			int temp = array[min_index];
			array[min_index]= array[i];
			array[i] = temp;
		}
			
	}
	
	public static void main(String[] args) {	
		int[] data = {64, 12, 22, 25, 11, 23, 100, 99};
		
		Selection_sort s_sorted =  new Selection_sort();
		s_sorted.Select_sorted(data);
		System.out.println(Arrays.toString(data));
		
	}

	
}
