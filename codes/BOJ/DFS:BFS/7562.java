// BOJ 7562번: 나이트의 이동
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static int[] dx = {1,2,2,1,-1,-2,-2,-1};
    static int[] dy = {-2,-1,1,2,2,1,-1,-2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            st = new StringTokenizer(br.readLine());
            Node start = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            Node end = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            bfs(arr, start, end);
        }
    }

    public static void bfs(int[][] dist, Node start, Node end) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] isVisited = new boolean[dist.length][dist.length];
        q.add(start);
        isVisited[start.getX()][start.getY()] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.getX() == end.getX() && cur.getY() == end.getY()) {
                System.out.println(dist[cur.getX()][cur.getY()]);
                return;
            }

            for (int i = 0; i < 8; i++) {
                int nx = cur.getX() + dx[i];
                int ny = cur.getY() + dy[i];
                if (nx >= 0 && nx < dist.length && ny >= 0 && ny < dist.length && !isVisited[nx][ny]) {
                    isVisited[nx][ny] = true;
                    dist[nx][ny] = dist[cur.getX()][cur.getY()] + 1;
                    q.add(new Node(nx, ny));
                }
            }
        }
    }

    static class Node {
        private int x; private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}