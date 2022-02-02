// 2. 아나그램
import java.io.*;
import java.util.HashMap;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        HashMap<Character, Integer> hs = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hs.put(s1.charAt(i), hs.getOrDefault(s1.charAt(i), 0)+1);
            hs.put(s2.charAt(i), hs.getOrDefault(s2.charAt(i), 0)-1);
        }

        String answer = "YES";
        for (Character c : hs.keySet()) {
            if (hs.get(c) != 0) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}