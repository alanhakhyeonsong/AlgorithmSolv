# BOJ 1158번: 요세푸스 문제
import sys
n, k = map(int, sys.stdin.readline().split())
arr = []
result = []
for i in range(n):
    arr.append(i+1)

idx = 0
while len(arr) != 0:
    idx = (idx + k - 1) % len(arr)
    result.append(arr.pop(idx))

print('<', end='')
print(', '.join(map(str, result)), end='')
print('>')