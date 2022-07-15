from sys import stdin
from collections import deque

n, m = map(int, stdin.readline().split())
grid = [list(map(int, stdin.readline().rstrip())) for _ in range(n)]

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
q = deque()
q.append((0, 0))
count = 0

while q:
    x, y = q.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if grid[nx][ny] == 0:
            continue
        if grid[nx][ny] == 1:
            grid[nx][ny] = grid[x][y] + 1
            q.append((nx, ny))

print(grid[n-1][m-1])