# BOJ 7576번: 토마토
from collections import deque

dx = [0, 0, 1, -1]
dy = [1, -1, 0 ,0]

m, n = map(int, input().split())
tomatoes = [list(map(int, input().split())) for _ in range(n)]
dist = [[0] * m for _ in range(n)]

queue = deque()
for i in range(n):
    for j in range(m):
        if tomatoes[i][j] == 1:
            queue.append((i, j))

while queue:
    x, y = queue.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < m and tomatoes[nx][ny] == 0:
            tomatoes[nx][ny] = 1
            dist[nx][ny] = dist[x][y] + 1
            queue.append((nx, ny))

result = 0
for i in range(n):
    for j in range(m):
        if tomatoes[i][j] == 0:
            print(-1)
            exit()
        result = max(result, dist[i][j])

print(result)