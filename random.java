package project;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		int[] p = new int[10];
		int a;
		
		for(int i=0;i<10;i++) {
			p[i]=a=new Random().nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(p[j]==a)
					i--;
			}
		}
		
		for(int i=0;i<10;i++)
			System.out.print(p[i] + " ");
	}
}