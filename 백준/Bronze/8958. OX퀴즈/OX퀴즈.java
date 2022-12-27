import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++){
            String str = sc.next();
            char[] temp = str.toCharArray();
            int sum = 0;
            int score = 0;
            for(int j=0; j<temp.length; j++){
                if(temp[j]=='O'){
                    score++;
                    sum += score;
                } else{
                    score = 0;
                }
            }
            arr[i] = sum;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}