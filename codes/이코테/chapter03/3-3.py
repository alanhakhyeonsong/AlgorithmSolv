from sys import stdin

n, m = map(int, stdin.readline().split())
cards = [list(map(int, stdin.readline().split())) for _ in range(n)]

result = 0
for c in cards:
    _min = min(c)
    result = max(result, _min)

print(result)