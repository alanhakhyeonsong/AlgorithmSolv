n = int(input())
arr = list(map(int, input().split()))
arr.sort()

m = int(input())
x = list(map(int, input().split()))

def binary_search(a, start, end, target):
    if start > end:
        return None
    mid = (start + end) // 2
    if a[mid] == target:
        return mid
    elif a[mid] > target:
        binary_search(a, start, mid - 1, target)
    else:
        binary_search(a, mid + 1, end, target)


for i in x:
    result = binary_search(arr, 0, n - 1, i)
    if result != None:
        print('yes', end=' ')
    else:
        print('no', end=' ')