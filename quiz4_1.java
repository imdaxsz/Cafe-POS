package project3;

import java.util.Scanner;

public class quiz4_1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) { // 전체케이스
			int casenum = sc.nextInt();
			int[] score = new int[101];
			for(int j=0;j<101;j++)
				score[j]=0;
			
			for(int p=0;p<1000;p++) {
				int a =sc.nextInt();
				score[a]++;
			}
			
			int max = score[0];
			int maxscore = 0;
			
			for(int s=1;s<101;s++) {
				if (score[s]>=max) {
					max=score[s];
					maxscore = s;
				}
			}
			
			System.out.println();
			System.out.print("#"+ (i+1) + " " + maxscore);
		}
		
		sc.close();		
	}
}
