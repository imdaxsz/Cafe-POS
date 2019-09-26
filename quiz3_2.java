package project3;
import java.util.Scanner;

public class quiz3_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int stu = sc.nextInt();
			int hws = sc.nextInt();
			
			int[] st = new int[stu];
			int[] hw = new int[hws];
			
			for(int j=0;j<stu;j++) {
				st[j]=j+1;
			}
			
			for(int k=0;k<hws;k++) {
				hw[k]=sc.nextInt();
			}
			
			System.out.print("#"+(i+1)+" ");
			int s, p;
			for(p=0;p<stu;p++) {
				for(s=0;s<hws;s++) {
					if(st[p]!=hw[s])
						continue;
					else
						break;
				}
				if (s>=hws) {
					System.out.print(st[p] + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
