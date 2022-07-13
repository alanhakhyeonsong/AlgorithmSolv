from sys import stdin

n, m, k = map(int, stdin.readline().split())
arr = list(map(int, stdin.readline().split()))
arr.sort()

first = arr[-1]
second = arr[-2]

result = 0

count = m // (k + 1) * k
count += m % (k + 1)

result += first * count
result += (m - count) * second

print(result)