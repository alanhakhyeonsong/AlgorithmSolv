def solution(x, n):
    return [x + x * i for i in range(n)]


x1, n1 = 2, 5
# answer: [2, 4, 6, 8, 10]
print(solution(x1, n1))