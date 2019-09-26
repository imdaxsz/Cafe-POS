package project3;

import java.util.Scanner;

public class quiz3_1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int[] count = {50000,10000,5000,1000,500,100,50,10};
		int[][] charge = new int[n][8];
		// [0] = 50000 [1]=10000 [2]=5000 [3]=1000 [4]=500 [5]=100 [6]=50 [7]=10
		
		for(int i=0;i<n;i++) {
			int money = sc.nextInt();
		
			if(money>=50000) {
				charge[i][0] = money/50000;
				money = money%50000;
				for (int j=1;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=10000 && money<50000) {
				charge[i][1] = money/10000;
				money = money%10000;
				for (int j=2;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=5000 && money<10000) {
				charge[i][2] = money/5000;
				money = money%5000;
				for (int j=3;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=1000 && money<5000) {
				charge[i][3] = money/1000;
				money = money%1000;
				for (int j=4;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=500 && money<1000) {
				charge[i][4] = money/500;
				money = money%500;
				for (int j=4;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=100 && money<500) {
				charge[i][5] = money/100;
				money = money%100;
				for (int j=6;j<8;j++) {
					charge[i][j] = money/count[j];
					money = money % count[j];
				}
			}
			else if(money>=50 && money<100) {
				charge[i][6] = money/50;
				money = money%50;
				charge[i][7] = money/count[7];
				money = money % count[7];
			}
			else if(money>=10 && money<50) {
				charge[i][7] = money/count[7];
			}

		}

		for(int i=0;i<n;i++) {
			System.out.println("#"+ (i+1));
			for(int k=0;k<8;k++) {
				System.out.print(charge[i][k] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}
