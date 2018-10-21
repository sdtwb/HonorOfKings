package com.main;
import java.util.*;
public class Main {
	static int maxSize= 100+ 5;
	static int [] sitting= new int[maxSize];
	static int [] sitNum= new  int[20+ 5];
	int getBlank(int in) {
		for(int i= 0; i< 20; i++) {
			if(in<= sitNum[i]) {
				return i;
			}
		}
		return -1;
	}
	void sit(int in, int size) {
		int count= 0; 
		for(int i= in; i<= in+ 5; i++) {
			if(sitting[i]== 0) {
				sitting[i]= 1;
				System.out.print(i+ " ");
				count++;//System.out.print("aaaa");
			}
			
			if(count== size)
				break;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Main main= new Main();
		
		int t= scanner.nextInt();
		

		
		Arrays.fill(sitting, 0);
		Arrays.fill(sitNum, 5);
		while((t--)!= -1) {
			int in= scanner.nextInt();
			
			if(main.getBlank(in)!= -1) {
				int inn= main.getBlank(in);
				//System.out.print(inn);
				main.sit(inn*5+ 1, in);
				sitNum[inn]-= in;
			}
			else {
				int count= 0;
				for(int i= 1; i<= 100; i++) {
					if(sitting[i]!= 0) {
						System.out.print(sitting[i]+ " ");
						sitting[i]= 1;
						count++;
						sitNum[i/5]--;
					}
					if(count== in)
						 break;
				}
				System.out.println();
			}
		}
	}
}
