// 7. 좌표 정렬
import java.io.*;
import java.util.*;

public class Practice07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Node(x, y));
        }
        Collections.sort(list);
        for (Node node : list) {
            System.out.println(node.x + " " + node.y);
        }
    }

    static class Node implements Comparable<Node> {
        int x; int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else return this.x - o.x;
        }
    }
}