package silver;

import java.util.*;

//올바른 배열
public class S1337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        len = sc.nextInt();

        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(sc.nextLong());
        }

        Collections.sort(list);

//        System.out.println(list.toString());

        int[] cnt = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < 5; j++) {
                if (!list.contains(list.get(i) + j)) cnt[i]++;
            }
        }
        Arrays.sort(cnt);
        System.out.println(cnt[0]);
    }

}
