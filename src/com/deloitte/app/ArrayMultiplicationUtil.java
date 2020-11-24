package com.deloitte.app;

import java.util.ArrayList;
import java.util.List;

public class ArrayMultiplicationUtil {

	public static List<Integer> multiplyElements(int[] numbers) {
		if(numbers == null) {
			return null;
		}

		List<Integer> result = new ArrayList<Integer>();

		int y=1;
		for(int i=numbers.length-1; i>=0; i--) {
			y++;
			for(int x=numbers.length-y; x>=0; x--) {
				//System.out.println("i: "+i + ", x: "+ x);
				int a = numbers[i] * numbers[x];
				System.out.println(a);	
				result.add(a);
			}
		}

		return result;
	}
}