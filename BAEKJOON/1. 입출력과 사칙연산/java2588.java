import java.util.Scanner;

public class java2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int temp = 10;

        for(int i=1; i<=3; i++){
            System.out.println(A * (B%temp));
            B /= 10;
            temp = temp * 10;
            
        }

        System.out.println(A * B);

        sc.close();
    }
}
