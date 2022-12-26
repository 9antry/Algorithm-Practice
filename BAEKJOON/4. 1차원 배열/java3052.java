// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
import java.util.Scanner;

public class java3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int temp;
        int[] result = new int[42];
        int count = 0;

        for(int i=0; i<10; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<A.length; i++){
            temp = A[i]%42;
            result[temp] = 1;
        }

        for(int i=0; i<result.length; i++){
            if(result[i]==1)
                count++;
        }

        System.out.print(count);
        sc.close();
    }
}
