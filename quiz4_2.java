package project3;
import java.util.Scanner;

public class quiz4_2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int count=1;
			int num = sc.nextInt();
			
			int[] a = new int [10];
			for(int j=0;j<10;j++)
				a[j]=0;
			
			while (true) {
				String str = Integer.toString(num);
				String[] num1 = str.split("");
				int b[] = new int [num1.length];
				for(int s=0;s<num1.length;s++)
					b[s]=Integer.valueOf(num1[s]);
				
				for(int k=0;k<b.length;k++) {
					for(int p=0;p<10;p++) {
						if(b[k]==p && a[p]==0)
							a[p]=1;
					}
				}
				
				int q;
				for(q=0;q<10;q++) {
					if(a[q]==0)
						break;
				}
				
				if(q>=10)
					break;
				else {
					num = num/count;
					count++;
					num = num*count;
				}
			}
			System.out.println("#" + (i+1) + " " + num);
		}
		sc.close();
	}
}
