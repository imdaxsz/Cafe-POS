package projcet2;

import java.util.Scanner;

public class quiz2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] a=new int[3];
		int[] b=new int[3];
		
		for(int i=0;i<3;i++) {
			if(num1%10!=0) {
				a[i] = num1 % 10;
				num1=num1/10;
			}
			if(num2%10!=0) {
				b[i] = num2 % 10;
				num2=num2/10;
			}
		}
		
		num1 = a[0]*100+a[1]*10+a[2];
		num2 = b[0]*100+b[1]*10+b[2];
		
		if(num1>num2)
			System.out.print(num1);
		else
			System.out.print(num2);
		sc.close();
	}

}



