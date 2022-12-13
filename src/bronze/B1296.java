package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//팀 이름 정하기
public class B1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int teamNum = Integer.parseInt(br.readLine());
        String[] teamName = new String[teamNum];
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> maxTeamName = new ArrayList<>();

        for (int i = 0; i < teamNum; i++) {
            teamName[i] = br.readLine();
        }
        int max = 0;
        int score;
        for (int i = 0; i < teamNum; i++) {
            score = getScore(name, teamName[i]);
            map.put(teamName[i], score);
            max = Math.max(max, score);
        }

        for (int i = 0; i < teamNum; i++) {
            if (map.get(teamName[i]) == max) {
                maxTeamName.add(teamName[i]);
            }
        }
        String winName = "";
        if (maxTeamName.size() > 1) {

            for (String tmp : maxTeamName) {
                if ("".equals(winName)) {
                    winName = tmp;
                } else {
                    winName = winName.compareTo(tmp) < 0 ? winName : tmp;
                }
            }
        } else {
            winName = maxTeamName.get(0);
        }
        System.out.println(winName);
    }

    static int getScore(String name, String tName) {
        String LOVE = "LOVE";
        int len = LOVE.length();
        int sum = 1;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                temp = findSpell(LOVE.charAt(i), name) + findSpell(LOVE.charAt(j), name) + findSpell(LOVE.charAt(i), tName) + findSpell(LOVE.charAt(j), tName);
                sum *= temp;
            }
        }
        return sum % 100;
    }

    static int findSpell(char c, String name) {
        int cnt = 0;
        for (int i = 0; i < name.length(); i++) {
            if (c == name.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}