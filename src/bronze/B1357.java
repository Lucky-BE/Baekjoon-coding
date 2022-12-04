package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//뒤집힌 덧셈
public class B1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        input = br.readLine().split(" ");

        int answer = rev(rev(Integer.parseInt(input[0])) + rev(Integer.parseInt(input[1])));

        System.out.println(answer);

    }

    static int rev(int num) {
        int result=0;
        while(num!=0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
