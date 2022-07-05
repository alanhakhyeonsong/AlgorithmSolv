def solution(numbers):
    str_numbers = list(map(str, numbers))
    str_numbers.sort(key=lambda x: x*3, reverse=True)

    return str(int(''.join(str_numbers)))


numbers1 = [6, 10, 2]
# result: 6210
numbers2 = [3, 30, 34, 5, 9]
# result: 9534330
numbers3 = [383, 38]
# result: 38383
numbers4 = [838, 83]
# result: 83883
print(solution(numbers1))