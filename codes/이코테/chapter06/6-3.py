from sys import stdin

n, k = map(int, stdin.readline().split())
list_a = list(map(int, stdin.readline().split()))
list_b = list(map(int, stdin.readline().split()))

list_a.sort()
list_b.sort(reverse=True)

for i in range(k):
    if list_a[i] < list_b[i]:
        list_a[i], list_b[i] = list_b[i], list_a[i]
    else:
        break

print(sum(list_a))