package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//최대 곱
public class S1500 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int s = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int n = s/k;
        int m = s%k;
        long answer = 1;

        List<Integer> list = new ArrayList<>();
        while (k > 0){
            if(m > 0){
                list.add(n+1);
                m--;
            }else {
                list.add(n);
            }
            k--;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            answer = answer * it.next();
        }

        System.out.println(answer);
    }

}
