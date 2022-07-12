import math
from itertools import permutations

def is_prime(x):
    if x < 2:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    num = []
    for i in range(1, len(numbers)+1):
        num.append(list(set(map(''.join, permutations(numbers, i)))))

    tmp = list(set(map(int, sum(num, []))))

    for i in tmp:
        if is_prime(i):
            answer += 1

    return answer


numbers = '17'
# result: 3
numbers2 = '011'
# result: 2
print(solution(numbers2))