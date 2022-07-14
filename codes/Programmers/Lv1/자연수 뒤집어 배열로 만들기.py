def solution(n):
    # answer = []
    # str_n = str(n)
    # for i in range(len(str_n)-1, -1, -1):
    #     answer.append(int(str_n[i]))

    answer = [int(i) for i in str(n)][::-1]

    return answer


n = 12345
# result: 5, 4, 3, 2, 1
print(solution(n))