import java.util.Scanner;

public class java25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();// 총 금액
        int N = sc.nextInt();// 구매한 물건의 종류의 수

        int a,b;// a : 각 물건의 가격, b : 각 물건의 개수
        int sum = 0;// 계산한 총 금액

        for(int i=0; i<N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a*b;
        }

        if(sum == X) System.out.print("Yes");
        else System.out.print("No");
         
        sc.close();
    }
}
