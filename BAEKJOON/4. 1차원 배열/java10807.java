import java.util.Scanner;

public class java10807{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();// 정수의 개수(1<=N<=100)
        int[] arr = new int[N];
        int count = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == v)
                count++;
        }

        System.out.println(count);

        sc.close();
    }
}