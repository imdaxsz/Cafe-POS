package project;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		int[] p = new int[10];
		
		for(int i=0;i<10;i++) {
			p[i]=new Random().nextInt(10)+1;
			System.out.print(p[i] + " ");
		}
	}
}
