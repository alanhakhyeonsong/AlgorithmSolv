// 9. 숫자만 추출
import java.io.*;

public class Practice09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(input));
    }

    public static int solution(String str) {
        int answer = 0;
/** 풀이 1
         for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') answer = answer * 10 + (c - '0');
         }
 **/
/** 풀이 2
 //        StringBuilder sb = new StringBuilder();
 //        for (int i = 0; i < str.length(); i++) {
 //            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') sb.append(str.charAt(i));
 //        }
 //        answer = Integer.parseInt(sb.toString());
 //        String tmp="";
 //        for (char c : str.toCharArray()) {
 //            if (Character.isDigit(c)) tmp += c;
 //        }
 //        answer = Integer.parseInt(tmp);
 **/
        str = str.toUpperCase().replaceAll("[A-Z]", "");
        answer = Integer.parseInt(str);
        return answer;
    }
}