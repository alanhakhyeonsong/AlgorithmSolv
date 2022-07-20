from sys import stdin

n = int(stdin.readline().strip())
arr = list(map(int, stdin.readline().split()))
d = [0] * 101

d[0] = arr[0]
d[1] = max(arr[1], arr[0])

for i in range(2, n):
    d[i] = max(d[i-1], d[i-2]+arr[i])

print(d[n-1])