def solution(m, n, puddles):
    dp = [[0] * (m+1) for _ in range(n+1)]
    dp[1][1] = 1
    for i in range(1, n+1):
        for j in range(1, m+1):
            if [j, i] in puddles or (i == 1 and j == 1):
                continue
            else:
                dp[i][j] = dp[i][j-1] + dp[i-1][j]

    return dp[n][m] % 1000000007


print(solution(4, 3, [[2, 2]]))

