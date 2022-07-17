n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

arr.sort(reverse=True)
print(' '.join(map(str, arr)))
