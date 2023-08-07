import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=-100000 && b<= 100000){
             System.out.println("a = "+a);
             System.out.println("b = "+b);
        }else{
            System.out.println("a와 b의 값의 범위가 맞지 않습니다.");
        }

    }
}