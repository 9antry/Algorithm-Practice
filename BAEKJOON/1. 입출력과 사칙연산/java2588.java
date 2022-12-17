import java.util.Scanner;

public class java2588 {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();//---(1)
        int num2 = sc.nextInt();//---(2)
        int temp1 = num2;//385
        int temp2 = (temp1/100)*100;//300
        
        sc.close();

        int num5 = num1 * temp2;//---(5)
        temp1 = temp1 - temp2;//85
        temp2 = (temp1/10)*10;//80
     
        int num4 = num1 * temp2;//---(4)
        temp1 = temp1 - temp2;//5
        temp2 = temp1;//5

        int num3 = num1 * temp2;//---(3)
        
        System.out.println(num3+"\n"+(num4/10)+"\n"+(num5/100)+"\n"
                        +(num3+num4+num5));//---(6)
    }
}
