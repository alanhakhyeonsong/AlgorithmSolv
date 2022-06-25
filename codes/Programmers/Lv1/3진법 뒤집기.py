def solution(n):
    answer = ''
    while n != 0:
        answer += str(n % 3)
        n = n // 3

    answer = int(answer, 3)
    return answer


n1 = 45
# result: 45(10진법) -> 1200(3진법) -> 0021(앞뒤 반전) -> 7(10진법)

n2 = 125
# result: 125 -> 11122 -> 22111 -> 229
print(solution(n2))