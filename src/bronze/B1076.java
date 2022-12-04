package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//저항
public class B1076 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        String[] arrr = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }

        long num = 0;
        for (int i = 0; i < 3; i++) {
            if(i < 2) {
                sb.append(Arrays.asList(arrr).indexOf(arr[i]));
            } else {
                num = Long.parseLong(sb.toString()) * (int)(Math.pow(10, Arrays.asList(arrr).indexOf(arr[i])));
            }
        }
        br.close();

        System.out.println(num);
    }
}
