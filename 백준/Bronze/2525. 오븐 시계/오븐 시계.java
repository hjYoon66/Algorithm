import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int ms = in.nextInt();

        int min = 60 * h + m;  //시 -> 분
        min += ms;

        int hour = (min / 60) % 24;  //분 -> 시
        int minute = min % 60;

        System.out.println(hour + " "+ minute);
    }
}