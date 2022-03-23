# BOJ 7569번: 토마토
import sys
from collections import deque
input = sys.stdin.readline

m, n, h = map(int, input().split())

dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, -1, 1]

tomatoes = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]
queue = deque()

# 3차원 bfs문제
def bfs():
    while queue:
        # 높이, x, y 순서
        z, x, y = queue.popleft()
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]
            if 0 <= nx < n and 0 <= ny < m and 0 <= nz < h:
                # 높이, x, y 순서
                if tomatoes[nz][nx][ny] == 0:
                    tomatoes[nz][nx][ny] = tomatoes[z][x][y] + 1
                    queue.append((nz, nx, ny))


for i in range(h):
    for j in range(n):
        for k in range(m):
            # 높이, x, y 순서
            if tomatoes[i][j][k] == 1:
                # 높이, x, y 순서
                queue.append((i, j, k))
bfs()
flag = False
result = -2
for i in range(h):
    for j in range(n):
        for k in range(m):
            # 높이, x, y 순서
            if tomatoes[i][j][k] == 0:
                flag = True
                # 높이, x, y 순서
            result = max(result, tomatoes[i][j][k])
if flag:
    print(-1)
elif result == -1:
    print(0)
else:
    print(result - 1)