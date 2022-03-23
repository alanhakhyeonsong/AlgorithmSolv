# BOJ 10026번: 적록색약
from collections import deque

def bfs(x,y):
    q.append((x,y))
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]
    visited[x][y] = True
    while q:
        x, y = q.popleft()
        for d in range(4):
            nx = x + dx[d]
            ny = y + dy[d]
            if 0 <= nx < n and 0 <= ny < n and a[nx][ny] == a[x][y] and not visited[nx][ny]:
                visited[nx][ny] = 1
                q.append((nx, ny))

n = int(input())
a = [list(input()) for _ in range(n)]
q = deque()

visited = [[False] * n for _ in range(n)]
count = 0
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i, j)
            count += 1

for i in range(n):
    for j in range(n):
        if a[i][j] == 'G':
            a[i][j] = 'R'

visited = [[False] * n for _ in range(n)]
blind = 0
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i, j)
            blind += 1

print(count, blind)