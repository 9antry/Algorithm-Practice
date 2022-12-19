import java.util.Scanner;

public class java2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        int m = H*60 + M - 45;

        if(m<0) m = 1440 + m;
        H = m/60;
        M = m%60;
        System.out.print(H +" "+ M);
    }
}
