import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int m = A*60 + B + C;
        
        if(m>=1440) m -= 1440;

        A = m/60;
        B = m%60;

        System.out.print(A+" "+B);
    }
}