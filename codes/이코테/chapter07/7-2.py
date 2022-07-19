n, m = map(int, input().split())

arr = list(map(int, input().split()))
arr.sort()

start = 0
end = arr[-1]

result = 0
while start <= end:
    count = 0
    mid = (start + end) // 2
    for x in arr:
        if x > mid:
            count += (x - mid)

    if count < m:
        end = mid - 1
    else:
        result = mid
        start = mid + 1

print(result)