package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//쉽게푸는 문제
public class B1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int cnt = 0;
        int sum = 0;

        int i = 1;
        while (end > cnt) {
            for (int j = 0; j < i; j++) {
                cnt++;
                if (cnt >= start) {
                    sum += i;
                }
                if(cnt == end) {
                    break;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
