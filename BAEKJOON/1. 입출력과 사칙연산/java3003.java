import java.util.Scanner;

public class java3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int L = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int P = sc.nextInt();

        System.out.println((1-K) +" "+ (1-Q) +" "+ (2-L) +" "+ (2-B) +" "+ (2-N) +" "+ (8-P));

        sc.close();
    }
}
