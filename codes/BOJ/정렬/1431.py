# BOJ 1431번: 시리얼 번호
n = int(input())
arr = []
for _ in range(n):
    arr.append(input())

def counting(inputs):
    count = 0
    for i in inputs:
        if i.isdigit():
            count += int(i)
    return count

arr.sort(key=lambda x: (len(x), counting(x), x))
for i in arr:
    print(i)