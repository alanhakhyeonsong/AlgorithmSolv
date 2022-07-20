from sys import stdin

x = int(stdin.readline().strip())
d = [0] * 30001

for i in range(2, x+1):
    d[i] = d[i-1] + 1
    if x % 5 == 0:
        d[i] = min(d[i//5] + 1, d[i])
    elif x % 3 == 0:
        d[i] = min(d[i//3] + 1, d[i])
    elif x % 2 == 0:
        d[i] = min(d[i//2] + 1, d[i])

print(d[x])