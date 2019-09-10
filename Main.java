import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int ans = num1*num2*num3;
		
		String num = Integer.toString(ans);
		
		int[] count = new int[10];
		
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i)=='0')
				count[0]++;
			if(num.charAt(i)=='1')
				count[1]++;
			if(num.charAt(i)=='2')
				count[2]++;
			if(num.charAt(i)=='3')
				count[3]++;
			if(num.charAt(i)=='4')
				count[4]++;
			if(num.charAt(i)=='5')
				count[5]++;
			if(num.charAt(i)=='6')
				count[6]++;
			if(num.charAt(i)=='7')
				count[7]++;
			if(num.charAt(i)=='8')
				count[8]++;
			if(num.charAt(i)=='9')
				count[9]++;
		}
		
		for(int i=0;i<count.length;i++)
			System.out.println(count[i]);
	
		sc.close();
		
	}
}
	