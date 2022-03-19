# BOJ 1181번: 단어 정렬
import sys
n = int(sys.stdin.readline())
arr = []
for _ in range(n):
    arr.append(sys.stdin.readline().rstrip())
arr_set = set(arr)
arr = list(arr_set)
arr.sort()
arr.sort(key=len)
for i in arr:
    print(i)