import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] table = new int[9][9];
        int max = -1;
        int row = 1;
        int col = 1;
        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                table[i][j] = Integer.parseInt(input[j]);

                if (table[i][j] > max) {
                    max = table[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
