import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }

        int b = in.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}