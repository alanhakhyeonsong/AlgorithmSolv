# BOJ 10814번: 나이순 정렬
n = int(input())
_input = []
for _ in range(n):
    a, b = input().split()
    _input.append([int(a), b])
tmp = {}
for i in range(n):
    tmp[i] = _input[i]

_input.sort(key=lambda x: (x[0], tmp))
for a, b in _input:
    print(str(a), b)