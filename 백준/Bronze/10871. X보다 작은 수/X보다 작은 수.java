import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        for (int a : arr) {
            if (a < X)
                System.out.print(a + " ");
        }
    }
}