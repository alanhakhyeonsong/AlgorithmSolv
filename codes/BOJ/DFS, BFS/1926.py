# BOJ 1926번: 그림
from collections import deque
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]

count = 0
size = 0

for i in range(n):
    for j in range(m):
        if visited[i][j] or grid[i][j] == 0:
            continue
        queue = deque()
        queue.append((i, j))
        visited[i][j] = True
        count += 1
        area = 0
        while queue:
            area += 1
            x, y = queue.popleft()
            for k in range(4):
                nx = x + dx[k]
                ny = y + dy[k]
                if 0 <= nx < n and 0 <= ny < m:
                    if not visited[nx][ny] and grid[nx][ny] == 1:
                        queue.append((nx, ny))
                        visited[nx][ny] = True
        size = max(size, area)

print(count)
print(size)