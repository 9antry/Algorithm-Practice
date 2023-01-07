// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();// 수열 A의 정수의 개수
        int X = sc.nextInt();// 비교할 정수 X

        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<A.length; i++){
            if(A[i]<X)
                System.out.print(A[i]+" ");
        }

        sc.close();
    }
}