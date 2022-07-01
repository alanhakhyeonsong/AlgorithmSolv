def solution(n):
    answer = n-1
    for i in range(2, answer):
        if answer % i == 0:
            answer = i
    return answer


n1 = 10
# result 3
n2 = 12
# result 11
print(solution(n1))