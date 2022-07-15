from sys import stdin

N, M = map(int, stdin.readline().split())  # 세로, 가로
visited = [[0] * M for _ in range(N)]

a, b, _dir = map(int, stdin.readline().split())
# 육지: 0, 바다: 1
grid = [list(map(int, stdin.readline().split())) for _ in range(N)]

visited[a][b] = 1

# 북, 동, 남, 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def turn():
    global _dir
    _dir -= 1
    if _dir == -1:
        _dir = 3


count = 1
turn_time = 0
while True:
    turn()
    nx = a + dx[_dir]
    ny = b + dy[_dir]
    if visited[nx][ny] == 0 and grid[nx][ny] == 0:
        visited[nx][ny] = 1
        a = nx
        b = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1

    if turn_time == 4:
        nx = a - dx[_dir]
        ny = b - dy[_dir]
        if grid[nx][ny] == 0:
            a = nx
            b = ny
        else:
            break
        turn_time = 0

print(count)
