// 4. 모든 아나그램 찾기
import java.io.*;
import java.util.HashMap;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        int answer = 0;
        int len = t.length()-1;
        for (int i = 0; i < len; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        int lt = 0;
        for (int rt = len; rt < s.length(); rt++) {
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0)+1);
            if (sMap.equals(tMap)) answer++;
            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt))-1);
            if (sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }
}