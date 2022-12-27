import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Double[] score = new Double[N];
        Double M = 0.0;
        Double sum = 0.0;

        for(int i=0; i<N; i++){// score 배열에 각 점수 입력, 최댓값 M 구하기
            score[i] = sc.nextDouble();
            if(score[i]>M)
                M = score[i];
            //System.out.println(score[i]);
        }
        //System.out.println("최고점 M : "+M);
        for(int i=0; i<score.length; i++){// 점수/M*100으로 고치기, 총 점수 구하기
            score[i] = (score[i]/M)*100;
            sum += score[i];
            //System.out.println(score[i]);
        }

        System.out.print(sum/N);
        
        sc.close();
    }
}