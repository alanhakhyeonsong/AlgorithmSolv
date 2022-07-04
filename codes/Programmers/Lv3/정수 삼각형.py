def solution(triangle):
    n = len(triangle)
    dp = [[0] * n for _ in range(n)]
    dp[0][0] = triangle[0][0]
    for i in range(n-1):
        for j in range(len(triangle[i])):
            dp[i+1][j+1] = max(dp[i+1][j+1], dp[i][j] + triangle[i+1][j+1])
            dp[i+1][j] = max(dp[i+1][j], dp[i][j] + triangle[i+1][j])

    print(dp)
    return max(dp[n-1])


triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
# result: 30
print(solution(triangle))