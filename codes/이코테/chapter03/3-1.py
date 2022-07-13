from sys import stdin

input = stdin.readline()
N = int(input.strip())

coins = [500, 100, 50, 10]
count = 0
for i in range(len(coins)):
    if (N // coins[i]) > 0:
        count += (N // coins[i])
        N %= coins[i]

print(count)