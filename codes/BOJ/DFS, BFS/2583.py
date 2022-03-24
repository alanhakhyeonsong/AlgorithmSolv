# BOJ 2583번: 영역 구하기
from collections import deque
dx, dy = [0, 0, -1, 1], [-1, 1, 0, 0]

m, n, k = map(int, input().split())
grid = [list([0] * n) for _ in range(m)]

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for j in range(y1, y2):
        for i in range(x1, x2):
            grid[j][i] = 1

sizes = []
for j in range(m):
    for i in range(n):
        if grid[j][i] == 0:
            queue = deque()
            queue.append((i, j))
            grid[j][i] = 1
            count = 1
            while queue:
                x, y = queue.popleft()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0 <= nx < n and 0 <= ny < m and grid[ny][nx] == 0:
                        grid[ny][nx] = 1
                        queue.append((nx, ny))
                        count += 1
            sizes.append(count)

sizes.sort()
print(len(sizes))
for s in sizes:
    print(s, end=" ")