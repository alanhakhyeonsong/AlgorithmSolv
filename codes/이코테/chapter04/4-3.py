idx = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
dx = [2, 2, 1, 1, -2, -2, -1, -1]
dy = [1, -1, 2, -2, 1, -1, 2, -2]

start = input()
x = idx.index(start[0])+1
y = int(start[1])

count = 0
for i in range(8):
    nx = x + dx[i]
    ny = y + dy[i]
    if 1 <= nx <= 8 and 1 <= ny <= 8:
        count += 1

print(count)