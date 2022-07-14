from sys import stdin

N = int(stdin.readline().rstrip())
plans = list(stdin.readline().split())
print(plans)

moves = ['L', 'R', 'U', 'D']
dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]

x, y = 1, 1
for plan in plans:
    for i in range(4):
        if plan == moves[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > N or ny > N:
        continue

    x, y = nx, ny

print(x, y)