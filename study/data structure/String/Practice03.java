// 3. 문장 속 단어
import java.io.*;
import java.util.*;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        String result = list.get(0);
        for (int i = 0; i < list.size()-1; i++) {
            if (result.length() < list.get(i+1).length()) {
                result = list.get(i+1);
            }
        }

        System.out.println(result);
    }
}