def solution(numbers):
    answer = 0
    for i in range(0, 10):
        if i not in numbers:
            answer += i
    return answer


numbers1 = [1, 2, 3, 4, 6, 7, 8, 0]
# result: 14
numbers2 = [5, 8, 4, 0, 6, 7, 9]
# result: 6

print(solution(numbers1))
