package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자 정사각형
public class S1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size;

        size = br.readLine().split(" ");

        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        String[][] recArr = new String[row][col];

        for(int i = 0; i < row; i++) {
            String[] tmp = br.readLine().split("");
            recArr[i] = tmp;
        }
        int cnt;
        int recSize;
        
        int max = 1;
        
        for (int k = 0; k < row; k++) {
            for (int i = 0; i < col - 1; i++) {
                for (int j = i + 1; j < col; j++) {
                    if (recArr[k][i].equals(recArr[k][j])) {
                        cnt = j - i;
                        recSize = (int)Math.pow(findX(recArr, k, i, j, cnt),2);
                        max = Math.max(max, recSize);
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static int findX(String[][] arr, int row, int s, int l, int cnt) {
        int len = arr.length;
        if (row + cnt > len - 1) {
            return 1;
        }
        else if(arr[row][s].equals(arr[row + cnt][s]) && arr[row][l].equals(arr[row + cnt][l])) {
            return cnt + 1;
        }
        return 1;
    }

}
