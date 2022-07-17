from sys import stdin

n = int(stdin.readline().strip())
arr = []
for i in range(n):
    a, b = stdin.readline().split()
    arr.append((a, int(b)))

arr.sort(key=lambda x: x[1])

for i in arr:
    print(i[0], end=' ')