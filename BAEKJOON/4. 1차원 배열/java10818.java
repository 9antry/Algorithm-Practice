// N개의 정수가 주어진다.
// 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class java10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
        }

        System.out.print(min+" "+max);
        
        sc.close();
    }
}
