// 1. 문자 찾기
import java.io.*;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine()
                .toLowerCase()
                .toCharArray();
        char target = br.readLine().toLowerCase().charAt(0);
        int[] count = new int[26];
        for (char c : input) {
            count[c-'a']++;
        }
        System.out.println(count[target-'a']);
    }
}
