import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); //방학
        int A = Integer.parseInt(br.readLine()); //국어
        int B = Integer.parseInt(br.readLine()); //수학
        int C = Integer.parseInt(br.readLine()); //하루에 국어 최대 페이지
        int D = Integer.parseInt(br.readLine()); //하루에 수학 최대 페이지

        double max = Math.max((double) A / (double) C, (double) B / (double) D);
        max = Math.ceil(max);
        L -= (int) max;
        System.out.println(L);
    }
}
