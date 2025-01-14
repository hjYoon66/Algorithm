import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char userInput = br.readLine().charAt(0);

        if (userInput== 'M') {
            System.out.println("MatKor");
        }else if (userInput == 'W'){
            System.out.println("WiCys");
        }else if (userInput == 'C'){
            System.out.println("CyKor");
        }else if (userInput == 'A'){
            System.out.println("AlKor");
        }else if (userInput == '$'){
            System.out.println("$clear");
        }
    }
}
