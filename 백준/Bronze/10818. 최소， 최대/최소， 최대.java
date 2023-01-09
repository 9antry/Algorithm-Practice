import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		int n=Integer.parseInt(N);
		String[] num=new String[n];
		String str = sc.nextLine();
		
		num=str.split(" ");
		
		int min=Integer.parseInt(num[0]);
		int max=Integer.parseInt(num[0]);
		
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(num[i])<min) {
				min=Integer.parseInt(num[i]);
			}
			if(Integer.parseInt(num[i])>max)
				max=Integer.parseInt(num[i]);
		}
		
//		System.out.println("최솟값 : "+min);
//		System.out.println("최댓값 : "+max);
//		
		System.out.print(min+" "+max);
		sc.close();
	}

}
