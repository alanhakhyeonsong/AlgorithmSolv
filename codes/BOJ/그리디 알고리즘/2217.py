# BOJ 2217번: 로프
import sys
n = int(sys.stdin.readline().rstrip())
arr = []
for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))

def solution():
    arr.sort(reverse=True)
    for i in range(n):
        arr[i] = arr[i] * (i + 1)

    return max(arr)

print(solution())