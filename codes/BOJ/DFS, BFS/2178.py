# BOJ 2178번: 미로 탐색
from collections import deque
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

n, m = map(int, input().split())
grid = [list(map(int, input())) for _ in range(n)]
distance = [[-1] * m for _ in range(n)]

queue = deque()
queue.append((0, 0))
distance[0][0] = 1
while queue:
    x, y = queue.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < m:
            if distance[nx][ny] == -1 and grid[nx][ny] == 1:
                distance[nx][ny] = distance[x][y] + 1
                queue.append((nx, ny))

print(distance[n-1][m-1])