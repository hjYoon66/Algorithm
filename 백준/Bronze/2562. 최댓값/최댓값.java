import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int max = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            count++;
            if (arr[i] > max) {
                max = arr[i];
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}