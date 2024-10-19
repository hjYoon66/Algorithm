import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String str = Integer.toString(result);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}