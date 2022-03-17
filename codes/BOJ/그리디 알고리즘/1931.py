# BOJ 1931번: 회의실 배정
arr = []
n = int(input())
for i in range(n):
    s, e = map(int, input().split())
    arr.append([s, e])

arr.sort(key=lambda i: i[0])
arr.sort(key=lambda i: i[1])

count = 0
last = 0
for i, j in arr:
    if i >= last:
        count += 1
        last = j
print(count)