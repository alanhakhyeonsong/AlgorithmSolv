def solution(n, horizontal):
    answer = [list([0] * n) for _ in range(n)]
    answer[0][0] = 1
    for i in range(1, n):
        answer[i][i] = answer[i-1][i-1] + i * 2

    if horizontal:
        for i in range(1, n):
            cur_ver, cur_ho = answer[i][i], answer[i][i]
            for j in range(1, n):
                if i % 2 == 1:
                    answer[i-j][i] = cur_ver - 1
                    answer[i][i-j] = cur_ho + 1
                else:
                    answer[i-j][i] = cur_ver + 1
                    answer[i][i-j] = cur_ho - 1
                cur_ver = answer[i-j][i]
                cur_ho = answer[i][i-j]

    else:
        for i in range(1, n):
            cur_ver, cur_ho = answer[i][i], answer[i][i]
            for j in range(1, n):
                if i % 2 == 1:
                    answer[i-j][i] = cur_ver + 1
                    answer[i][i-j] = cur_ho - 1
                else:
                    answer[i-j][i] = cur_ver - 1
                    answer[i][i-j] = cur_ho + 1
                cur_ver = answer[i-j][i]
                cur_ho = answer[i][i-j]

    return answer


n1 = 4
horizontal1 = True
n2 = 5
horizontal2 = False
print(solution(n2, horizontal2))