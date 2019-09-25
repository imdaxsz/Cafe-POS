package project3;

import java.util.Scanner;

public class quiz2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		
		String[] str = new String[n];
		for(int p=0;p<n;p++)
			str[p] = sc.next();
		
		for(int s=0;s<n;s++) {
			 char[] ch = str[s].toCharArray();
			 int[] a = new int[str[s].length()];
			 a[0]=0;
			 for(int j=1;j<str[s].length();j++) {
				 if(ch[j-1]!=ch[j])
					 a[j]=1;
				 else
					 a[j]=0;
			 }
			 for(int j=1;j<str[s].length();j++) {
				 if(a[j]==1) {
					 int k;
					 for(k=0;k<j;k++) {
						 if(ch[j]==ch[k]) {
							 break;
						 }
					 }
					 if (k<j-1) {
						 count--;
						 break;
					 }
				 }
			}
		}
		System.out.print(count);
		sc.close();
	}
}
