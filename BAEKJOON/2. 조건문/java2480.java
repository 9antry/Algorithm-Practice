import java.util.Scanner;

public class java2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close(); 

        int money = -1;

        if(A==B&&B==C)// A B C 모두 같은 경우
            money = 10000 + A*1000;
        else{
            if(A==B||A==C)// A=B 경우 or A=C 경우
                money = 1000 + A*100;
            else if(B==C)// B=C 경우
                money = 1000 + B*100;
            else{// 모두 다른 경우
                int max = 1;
                if(A>max) max = A;
                if(B>max) max = B;
                if(C>max) max = C;  
                money = max*100;
            }
        }

        System.out.print(money);
    }
}
