def solution(a, b):
    answer = 0
    for i in range(len(a)):
        answer += (a[i] * b[i])

    return answer


a1 = [1, 2, 3, 4]
b1 = [-3, -1, 0, 2]
# result: 3
print(solution(a1, b1))

a2 = [-1, 0, 1]
b2 = [1, 0, -1]
# result: -2
print(solution(a2, b2))