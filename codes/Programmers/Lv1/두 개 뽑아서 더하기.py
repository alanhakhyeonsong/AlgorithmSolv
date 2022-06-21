def solution(numbers):
    answer = []
    tmp = set()
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            tmp.add(numbers[i] + numbers[j])

    answer = list(tmp)
    answer.sort()
    return answer

numbers = [2, 1, 3, 4, 1]
# result = [2, 3, 4, 5, 6, 7]

print(solution(numbers))