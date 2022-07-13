def dfs(numbers, target, i, _sum):
    if i == len(numbers):
        if _sum == target:
            return 1
        return 0
    return dfs(numbers, target, i + 1, _sum + numbers[i]) + dfs(numbers, target, i + 1, _sum - numbers[i])

def solution(numbers, target):
    answer = dfs(numbers, target, 0, 0)
    return answer


numbers = [4, 1, 2, 1]
target = 4
# result: 2
print(solution(numbers, target))