package com.deloitte.app;

public class Application {

	public static void main(String[] args) {
		int num[] = {5,6,10}; //60, 50, 30	
		//int num[] = {2, 5,6,10}; //60, 50, 20, 30, 12, 10
		int y=1;
		for(int i=num.length-1; i>=0; i--) {
			y++;
			for(int x=num.length-y; x>=0; x--) {
				System.out.println("i: "+i + ", x: "+ x);
				int a = num[i] * num[x];
				System.out.println(a);	
			}
		}		
	}
}