import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num))+1):
        if num % i == 0:
            return False
    return True

def solution(n):
    answer = 0
    for i in range(1, n+1):
        if is_prime(i):
            answer += 1
    return answer


print(solution(5))
