from sys import stdin

n, m = map(int, stdin.readline().split())
grid = [list(map(int, stdin.readline().strip())) for _ in range(n)]

def dfs(x, y):
    if x <= -1 or y <= -1 or x >= n or y >= m:
        return False
    if grid[x][y] == 0:
        grid[x][y] = 1
        dfs(x+1, y)
        dfs(x, y+1)
        dfs(x-1, y)
        dfs(x, y-1)
        return True
    return False


count = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            count += 1

print(count)