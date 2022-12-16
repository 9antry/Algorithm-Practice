package Programmers.level0;

public class level0_007 {
    // level0 - 분수의 덧셈
    /*
    문제 설명>>
    첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    제한 사항>>
    0 <denum1, num1, denum2, num2 < 1,000

    */ 
}

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        
        int max = 1;
        
        for(int i=1; i<=denum; i++){
            if((denum%i == 0) && (num%i == 0))
                max = i;
        }
        
        answer[0]= denum/max;
        answer[1]= num/max;
        
        return answer;
    }
}